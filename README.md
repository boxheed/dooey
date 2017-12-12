# dooey - A Java command line library

## A command line library you say?

Yes, yet another command line library. This one however is different to many others that
provide simple argument parsing. This library provides command execution and contextual 
sub command processing with a discovery framework for registering commands and 
sub commands. 

What do I mean? Well I mean that you could do something like `./app -h` to get simple help output
as well as `./app command -h` or even `./app command subcommand -h`.

## Terms

| term | definition |
| application | the name of the application |
| flag | a switchable argument passed to the application/command prefixed with either a `-` or a `--` |
| command | an argument passed to the application that changes the actual operation that the application will perform |
| sub command | an argument that 


## Scenarios

# As a user I want to get a list of top level commands 
given that the application
