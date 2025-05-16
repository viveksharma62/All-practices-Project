import pywhatkit as kit
import datetime
import time

# List of phone numbers (in international format)
phone_numbers = [
    "+912365897413",
    "+912365478910",
    "+911234567890"
]

# Message to send
message = "Hello! This is a test message from Python."

# Get current time
now = datetime.datetime.now()

# Set the time 2 minutes ahead from current time
hour = now.hour
minute = now.minute + 1

# Loop through each phone number and send the message
for phone_number in phone_numbers:
    # Adjust the time for each phone number
    kit.sendwhatmsg(phone_number, message, hour, minute)
    
    # Delay to ensure each message is sent properly
    time.sleep(15)  # 15 seconds delay to avoid sending too quickly

print("Messages have been scheduled.")
