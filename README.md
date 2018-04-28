# Gas-Pump-Application
This is a object oriented Java Application which consists of Gas Pump components designed using Model Driven Architecture(MDA) and implemented using Creational and Structural Design patterns.
 
## Usage:
Steps to execute the GasPump executable:
1. Find the GasPump.bat and double click on the batch file or execute the GasPump.jar using the java command `java -jar GasPump.jar`.
2. The application is triggered and ready for testing.

### Add/Modify functionality
1. Clone the repository
2. Change the `src` files accordingly
3. Create a executable jar of your own.

#### Test Cases
##### GasPump1: Sequence of operations showing how one gallon of Regular gas is disposed
 1. Activate(3.1, 4.3), Start(), PayCredit(), Approved(), Regular(), StartPump(), PumpGallon(), StopPump()
 
##### GasPump2: Sequence of operations showing how one liter of Premium gas is disposed in GasPump-2 
 1. Activate(3, 4, 5), Start(), PayCash(6), Premium(), StartPump(), PumpLiter(), PumpLiter(), NoReceipt()


Project Report.pdf - Detailed project report
 ## MDA EFSM State Diagram:
![MDA EFSM state diagram](https://github.com/Cheths/Gas-Pump-Application/blob/master/MDA%20EFSM.png?raw=true "MDA EFSM state diagram")

## Pattern description:

### State Pattern
* Uses a context class which manages the states by using a state pointer as a reference to forward calls to specific state classes.
                
### Abstract Factory Pattern 
* Used to group all the concrete factories for GasPump Components

### Strategy pattern
* Client of actions for various strategies. This contains multiple interfaces which are implemented by classes devising strategies.


## MDA-EFSM model for the GasPump Components

### MDA-EFSM meta events
    Activate()
    Start()
    PayType(int t) //credit: t=1; cash: t=2
    Reject()
    Cancel()
    Approved()
    StartPump()
    Pump()
    StopPump()
    SelectGas(int g)
    Receipt()
    NoReceipt()

### MDA-EFSM meta actions
    StoreData // stores price(s) for the gas from the temporary data store
    PayMsg // displays a type of payment method
    StoreCash // stores cash from the temporary data store
    DisplayMenu // display a menu with a list of selections
    RejectMsg // displays credit card not approved message
    SetPrice(int g) // set the price for the gas identified by g identifier
    ReadyMsg // displays the ready for pumping message
    SetInitialValues // set G (or L) and total to 0
    PumpGasUnit // disposes unit of gas and counts # of units disposed
    GasPumpedMsg // displays the amount of disposed gas
    StopMsg // stop pump message and receipt? msg (optionally)
    PrintReceipt // print a receipt
    CancelMsg // displays a cancellation message
    ReturnCash // returns the remaining cash
