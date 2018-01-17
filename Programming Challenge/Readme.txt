1. Design and implementation:
I used the Blocking Queue for the implementation of this code. Blocking Queue is an interface under java.util.concurrent package. It helps to contain objects when few threads is inserting objects and other threads are taking the objects out of it. Basically, the threads will keep on inserting the objects until a maximum capacity is attained of the Blocking Queue  after which the threads will be blocked and they will not be able to make further insertions, they will remain in the blocked state until the a few objects are removed from the blocking Queue. The whole idea is that the threads will keep on taking the objects out of the Queue until there is no object left in the Blocking Queue.
I have used two threads, the first thread t1 triggers the randomizer function that starts the generating the random values and the other thread t2 checks for the prime number.

2. Sample Output


3. Further work Ð if you have all the time in the world how would you implement:
JMS provides the features for communication between different components of the application. As the JMS provides the connection between sender/receiver server. I would have setup a destination queue . I would have used a middleware application server like Jboss with Eclipse. I would have defined JNDI Context Class as both Client and server would need this and will contain the JBoss Port number which would serve the request received. Then as I used in my code I would let the randomizer function generate the random numbers and also checking in the the output Queue. A JNDI context instance will be created, get it connected to the factory  and create connection and use the connection object to create session and monitor the input queue and thereby adding new elements to it. Also see the output Queue if it has any objects to be printed.  And Possibly a similar approach for the prime numbers.

