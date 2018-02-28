# Gas-Pump-Application
This is a object oriented Java Application which consists of Gas Pump components designed using Model Driven Architecture(MDA) and implemented using Creational and Structural Design patterns.


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
