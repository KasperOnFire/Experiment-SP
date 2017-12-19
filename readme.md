# SP - Experiments

Kasper

## Experiment

### Hypothesis:
In Java, the time to get a specific (here, the middle) element from an ArrayList scales with the number of 
elements in the list.
E. G: 10 elements = 1 second to get any. 100 elements = 10 seconds to get any element.

### Experiment:
Project code located in subfolder "Experiment"
Run Experiment.java, and observe results.

### Result:
It does not even matter if there is 100 or 1000000 elements in the list. Getting a specific object takes wildly 
random times - based on processor. There is no correlation between the number of elements and the time it takes 
to retrieve the object at a specific index. In the file, you will even see the list with a million objects be 
faster at random times.

Hypothesis: rejected.


