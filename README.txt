Shell script to export

i=1; for f in `ls`; do if [ $f = "favorites" ]; then cp $f ../converted64/unknown_64.png; else cp $f ../converted64/tile_${i}_64.png; (( i = i+1 )); fi; done;

And to move exported images:

( cd ../converted64/ && rm -Rf /home/fornwall/Documents/workspace-android/net.fornwall.memory/res/drawable-port/* && cp * /home/fornwall/Documents/workspace-android/net.fornwall.memory/res/drawable-port/ )