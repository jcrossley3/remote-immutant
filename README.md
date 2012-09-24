# Remote Messaging Example

An example of publishing/receiving messages outside of Immutant

## Usage

After deploying a HornetQ queue named "queue" (see below)...

    $ lein run -m remote.publish whatever message you want
    $ lein run -m remote.receive
    
To start up the queue, just deploy the app (see immutant.clj)

    $ lein immutant deploy
    $ lein immutant run
    
## License

Copyright © 2012 Jim Crossley

Distributed under the Eclipse Public License, the same as Clojure.
