import pywhatkit as kit
import datetime
import time

# List of phone numbers (in international format)

phone_numbers = [
    "+919304926750",
    "+919361985909",
    "+917644891130"
]

# Message to send
message = "Hello! This is a test message from Python."

# Get current time
now = datetime.datetime.now()

# Set the initial time to 2 minutes ahead from current time
initial_hour = now.hour
initial_minute = now.minute + 2

# Loop through each phone number and send the message
for i, phone_number in enumerate(phone_numbers):
    # Calculate the time for each message
    hour = initial_hour
    minute = initial_minute + (i * 10)  # Increment minutes by 10 seconds for each message

    # Adjust the time if minutes exceed 59
    if minute >= 60:
        hour += minute // 60
        minute = minute % 60

    # Send the WhatsApp message
    kit.sendwhatmsg(phone_number, message, hour, minute)

    # Delay to ensure each message is sent properly
    if i < len(phone_numbers) - 1:
        # Delay 10 seconds before scheduling the next message
        time.sleep(10)

print("Messages have been scheduled.")
