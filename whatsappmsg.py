import pywhatkit as kit
import datetime

# Replace with the correct phone number in international format
phone_number = "+917644891130"

# Message to send
message = "hello lecture anaa hai"

# Get current time
now = datetime.datetime.now()

# Set the time 2 minutes ahead from current time
hour = now.hour
minute = now.minute + 1

# Send the WhatsApp message
kit.sendwhatmsg(phone_number, message, hour, minute)
