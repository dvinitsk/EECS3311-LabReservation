#!/bin/bash
# Run the application (compile first if needed)
if [ ! -d "out" ] || [ -z "$(ls -A out 2>/dev/null)" ]; then
  echo "Compiling first..."
  ./build.sh
fi
java -cp out com.yorku.lab.Main
