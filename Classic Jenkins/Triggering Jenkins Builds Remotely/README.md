# EXECUTING JOBS REMOTELY

Check the option **Trigger builds remotely** from Build Triggers section in a jenkins Job

Enter a Authentication Token Generated from any Third Party Softwares like **KeyPassX**

Jenkins URL for Remote call would be as Below

```JENKINS_URL/job/Job_Name/build?token="ENTER_YOURSECRET_TOKEN"```

## EXECUTING MULTIPLE JOBS REMOTELY

Using **POSTMAN**

- In Chrome Developer Tools, Open *Network* Tab, Clear the existing Logs, and check the *Preseve Log* Option

- Now fire remote build request to Jenkins with URL format as mentioned in abive article (Expected Response Code : 201)

- Right click on the Request Entry and select the *Copy as Curl* option
 
- Switch to Postman Window, click on Import and select Raw Text Option and Paste the clipboard contents
 
- Repeat the steps for all such jobs which need to be run remotely
 
- Make them all a part of a single collection in Postman
 
- Once done, you can simple run the collection and it will fire all the requests in one go

***Optional Steps :** In case you need detailed reporting as Postman would display outputs only in JSON by default*
- Install *node* and *npm*, then run below command
    ```npm install -g newman newman-reporter-html newman-reporter-htmlextra```

- Export the JSON Report from Postman for the Collection, open a terminal in that directory and run below command
    ```newman run <Report_name.json> -r htmlextra```

- HTML Report is now ready and you can open it for a full view



Using **SLACK**

- Install slash commands add-onn app extension from slack marketplace

- Enter the command-line alias, URL with Token and save it !!

- Voila !! Job Runs by running ```/commandLineAlias```




