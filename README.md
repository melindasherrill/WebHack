# Web Exploiting Project
## CPSC 353

> Let's face it, websites are vulnerable, and in a growing world of technical advancement, they are only getting weaker. Cyber and security techniques in preventing attacks are becoming futile than ever. This project details examples the average hacker would use when trying to exploit a website. Our goal is to enlighten the novice web-developer and technologically illiterate on possible threats that exist within the hacking realm.

> The website we are hacking is [frechetta.me/WebHack](http://frechetta.me/WebHack). The python scripts interface with this website to exploit sql commands. Try messing around with the login page. Try typing in the login inputs:
``` 
OR '1'='1' /*
```

## Team members Logs
### Submission 2
1. Melinda Sherrill - worked front-end webpages and on SQL injections using python-coded expoits that utlitize the requests library
2. David Jensen - worked on APflood DoSS attack using web sockets in java
3. Edgar Delgado - worked on TCP+SYN flood using web sockets in java

## To Run Python scripts
* In the python folder, you will see a few python scripts. Both can be ran. One creates a sample database using the SQlite3 Api. The other will allow you to send sql injections to the website. First, make sure the python requests lib is installed on the icd server.
*  Run this:
``` pip install requests ```
* Once this is installed, you can run the sessions file:
``` python sessions.py "insert injection here" ```

## References:
1. http://www.pythonforbeginners.com/requests/using-requests-in-python
2. https://github.com/saminiir/level-ip
3. https://github.com/picoCTF/picoCTF-problems-deprecated
