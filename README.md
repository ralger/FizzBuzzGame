# Fizz Buzz Game

#### Note on appropriate level of problem abstraction 
Choosing the appropriate level of generalisation and abstraction to apply to a development problem is not always clear cut.
A few things that should be considered:

* Within the existing requirements can you see similarities that allow for an abstraction to avoid repeated code
* [YAGNI](https://martinfowler.com/bliki/Yagni.html) 
* If you are going to create abstractions that are not currently required  - Do you have sufficient knowledge of the domain to ensure the abstraction is correct?
* Are there any deadlines - abstractions can often cause an explosion in use case permutations that need test coverage, as well as making debugging more difficult
* If the problem is going to be abstracted then the testing needs to cover the complete abstraction that is implemented. It is very common yet wrong to implement generic code, but only create test cases for the original problem.

For this problem I have chosen to abstract only to the level requested. i.e. The evaluation rules for Fizz and Buzz can change.

