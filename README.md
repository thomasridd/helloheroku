
# HelloHeroku
This repo provides a kick off point for deploying any java project as a web app on Heroku. Our start app is [HelloJava](https://github.com/davidcarboni/hellojava) which deploys a super-simple REST api locally using the [Restolino](https://github.com/davidcarboni/restolino) framework.

> Requirements
> - Heroku account
> - Git installed
> - Heroku toolbelt installed

## Deployment
Begin by opening up a terminal window and cloning this repository


    $  git clone https://github.com/thomasridd/helloheroku.git

Enter the new folder and start up heroku

    $  cd helloheroku
    $  heroku login
Create a new app on Heroku

	$  heroku create
Upload the code

	$  git push heroku master
Simple as that. Test it by pointing your browser to

	https://[your app name].herokuapp.com/rest





