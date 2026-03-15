### Class definitions
1. `Controller`: this is the main driver class.
2. `IMusicPlayer`: this is the interface which undergoes the state changes. It will expose the functions of a music 
    player.
3. `IStates`: this is the interface which has all the states. We have the following states:
   1. Play
   2. Pause
   3. Stop

```
 ┌──────────┐      play       ┌───────────┐      pause       ┌────────────┐
 │ Stopped  │ ──────────────> │ Playing   │ ───────────────> │ Paused     │
 └─────┬────┘                 └─────┬─────┘                  └──────┬─────┘
       │                            │                               │
       └────────────────────────────┴───────────────────────────────┘
                         resume / stop → Stopped

```
