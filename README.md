# OSM denormalisation exercise

OSM data is represented by the [three element types nodes, ways and relations.](http://wiki.openstreetmap.org/wiki/Elements). Only nodes contain geographic information. So in order to display ways and relations, it is necessary to denormalise the model. 

**Exercise:** Write a simple denormalisation process using [geow](https://github.com/plasmap/geow), akka streams and/or monix that parses an osm file, denormalises the mdoel and serialises the elements as geojson.

To get you started quickly, just clone this repository that contains already the geow and akka streams (respectively monix) dependencies:
```sh
git clone https://github.com/janschultecom/denormalisation-exercise.git
cd denormalisation-exercise
```

The sample file can be downloaded here: [duesseldorf-regbez-latest.osm.bz2 @ 223MB](http://download.geofabrik.de/europe/germany/nordrhein-westfalen/duesseldorf-regbez-latest.osm.bz2) 
[bremen-latest.osm.bz2 @ 24.6MB](http://download.geofabrik.de/europe/germany/bremen-latest.osm.bz2)

The resuling geojson files can be tested here:
[geojson.io](http://geojson.io/#map=10/51.2030/6.8060)
