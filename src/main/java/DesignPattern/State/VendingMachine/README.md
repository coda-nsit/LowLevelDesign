# What is State design pattern?
Whenever there is an entity (Vending Machine, Music Player, ATM, etc.) which is acted upon by a user and due to these
actions, the entity goes through state changes.

```
 ┌──────────┐     selectProduct      ┌────────────────┐     payCoin      ┌──────────────┐
 │ IdleState│ ─────────────────────> │ AcceptCoinState│ ───────────────> │ DispenseState│
 └─────┬────┘                        └───────┬────────┘                  └─────┬────────┘
       │                                     │                                 │
       └─────────────────────────────────────┴─────────────────────────────────┘
                                   (returns to IdleState)

```

The entity has 3 states
1. IdleState
2. AcceptCoinState
3. ProductDispenseState

The actions performed on the entity are
1. selectProduct
2. payCoin
3. dispenseProduct

The actions cause the entity to go through states. The actions are done in `Client.java`.
1. The vending machine has the states (composition).
2. The states also take in the vending machine as an argument. (not required in this example as everything is a 
   singleton here).
3. The states themselves do the state transition (and not the client or the vending machine).

While implementing think the following.
1. Make a automata of the process.
2. Identify the actions that are being performed. These need to be exposed by the entity (`VendingMachine`)
3. Identify the states. In every state something happens. These are implemented by the states.