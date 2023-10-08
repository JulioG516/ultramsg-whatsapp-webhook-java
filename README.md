# ultramsg-whatsapp-webhook-java

simple project to handle incoming WhatsApp message using Java

by [Ultramsg.com](https://ultramsg.com/?utm_source=github&utm_medium=vbnet&utm_campaign=webhook) and [Julio Gabriel](https://github.com/JulioG516)

# Dependencies

for local development purposes, a tunneling service is required. This example uses ngrok , You can download ngrok from [here](https://ngrok.com/download).

# set Webhook URL 

Go to your ultramsg account for set Webhook URL after copying the ngrok url and add /api/ Route like this : 

```
https://501-414-43-1.ngrok.io/api/
```
and enable this option "Webhook on Received" .
# receive WhatsApp messages

now You should be able to receive WhatsApp webhooks  .

# Example json response
```
{
  "event_type": "message_received",
  "instanceId": "1150",
  "id": "",
  "referenceId": "",
  "data": {
    "id": "false_10171127174@c.us_3EB02E5EB89Cff3FB034",
    "from": "10122127174@c.us",
    "to": "10172124470@c.us",
    "author": "",
    "pushname": "Steve",
    "ack": "",
    "type": "chat",
    "body": "Hi,How are you",
    "media": "",
    "fromMe": false,
    "isForwarded": false,
    "isMentioned": false,
    "quotedMsg": {},
    "mentionedIds": [],
    "time": 1650002600
  }
}
```

## License
This project is licensed under the MIT License
