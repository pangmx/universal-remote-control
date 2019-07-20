# universal-remote-control
This is a Java project which demonstrates the Open Closed Principle (OCP) with Strategy Pattern. 

In Object-oriented programming, following the OCP, modules are open for extension but closed for modification. This helps in greater code re-usability, and minimise deployed code amendments when new changes are needed.

Problem statement of case study: 
Create a singleton Universal Remote Control which can be used to control 3 devices in the living room, namely TV, Sound System and Projector. The remote control should be able to select which device to connect to and turn the selected device On or Off. Taking note that there should be no change needed to the remote control class when there is a need to add any new devices with same On and Off functionalities in future.
