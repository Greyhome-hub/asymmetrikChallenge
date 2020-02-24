# asymmetrikChallenge
Brendan Graham


This program is designed to take in a text file containing the contents of a business card, and extract the name, phone number, and email address, and display them. 

To achieve this the Apache OpenNLP library was used to identify names in the text.

To extract the phone number, any line containing "fax" was excluded, then any remaining line with 10 or greater digits was the phone number.

For the email address the line containing the @ character was assumed to be the email address.

To use this program you must have the JRE version 1.8 or later installed. Then, in a directory containing BusinessCardReader.jar and a text file named card.txt containing the contents of a business card. 

Run the .jar from command line (java -jar BusinessCardReader.jar)

The name, phone number, and email address will then be displayed. 

To build the jar copy the contents of the bin folder to a directory.

Enter the following command in your console in that directory: jar cfm BusinessCardReader.jar Manifest.txt main META-INF opennlp resources
