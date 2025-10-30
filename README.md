# Mars Rover
A java program that runs a simple mars rover simulation. 

In order to run this simulation, navigate to the runsimulation.java file, and hit run.

# Detailed Description
    The below is a description of what happens in the simulation and expected results. 
    N_SIMULATIONS is an editable parameter which is the number of simulations the program
    will run (presently set to 100).
    
    Runs N_SIMULATIONS number of simulations of a Mars  rover travelling under 
    damage conditions. In each turn, travels forward or backward either 
    1, 2, 3, or 4 meters. Each simulation continues until there's no more power
    in the battery, or we fall off a cliff. Cliffs are at position = 1000 meters or
    position = -1000 meters. The program then counts how many times our Rover fell 
    out of N_SIMULATIONS, and reports it (our goal is that it falls 0 times)
    If we meet our goal, the program prints that our rover is ready to go to Mars!!
