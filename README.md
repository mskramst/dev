## Instructions for using development sandbox

The purpose of the sandbox is to get started coding in the most common languages
on any computer without worrying about if the necessary development kits are
installed.  By coding in a container, we can easily install what is necessary to
code quickly. 

Also allows you to try coding in different languages without mucking up your own
system.

Each language has its own README file to provide necessary directions for using
that language as well as some starter code as a sample.

Current languages: javascript (js), python (py), java (java), kotlin (kt), and golang (go)

Run the setup script with language you wish to use.  Use abbreviation above.

>  ./setup js

It will automatically download the required container and setup a volume and
starter code to begin coding.

The clean command will remove containers and images (similar to docker-compose)
  ./clean

Currently, it does not remove the code directory, but there are two comments in
clean that can be turned on to remove the coding folder.

  ./docker-prompt is useful for seeing a color prompt within a container.

To reattach to the container

You can use docker ps -a to view the containers and then docker start -ia
lang-proj
