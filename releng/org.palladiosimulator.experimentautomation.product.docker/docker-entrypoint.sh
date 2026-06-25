#!/bin/sh
# Entrypoint for experiment-automation Docker image.
# Starts Xvfb (needed by SWT/GTK even in headless mode), runs Eclipse,
# and propagates the exit code.
#
# Environment variables:
#   EA_CONSOLE_LOG  Set to "true" to add -consoleLog (logs to stderr)

set -e

XVFB_DISPLAY=:99
ECLIPSE_ARGS="-nosplash -product org.palladiosimulator.experimentautomation.product -data /data"

if [ "${EA_CONSOLE_LOG}" = "true" ]; then
    ECLIPSE_ARGS="${ECLIPSE_ARGS} -consoleLog"
fi

# Start Xvfb
Xvfb "$XVFB_DISPLAY" -screen 0 1280x1024x24 -nolisten tcp &
XVFB_PID=$!

export DISPLAY="$XVFB_DISPLAY"

# Run Eclipse; capture exit code
# shellcheck disable=SC2086
/opt/experiment-automation/eclipse ${ECLIPSE_ARGS} "$@"
EC=$?

# Clean up Xvfb
kill "$XVFB_PID" 2>/dev/null
wait "$XVFB_PID" 2>/dev/null

exit "$EC"
