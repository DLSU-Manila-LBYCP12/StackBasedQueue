# StackBasedQueue

## Sample Run:
```
run:
q.isEmpty() = true
q.isEmpty() = false
q.size() = 6

q.front = Milk
q.rear = Gingerbread

q.dequeue() = Milk
q.front = Butter
q.rear = Gingerbread

q.enqueue("Pineapple");
q.front = Butter
q.rear = Pineapple

q.dequeue() = Butter
q.front = Eggs
q.rear = Pineapple

q.dequeue() = Eggs
q.front = Cupcake
q.rear = Pineapple

q.dequeue() = Cupcake
q.front = Froyo
q.rear = Pineapple

q.dequeue() = Froyo
q.front = Gingerbread
q.rear = Pineapple

q.dequeue() = Gingerbread
q.front = Pineapple
q.rear = Pineapple

q.dequeue() = Pineapple
q.isEmpty() = true
q.size() = 0
Exception in thread "main" java.util.NoSuchElementException: ERROR: Empty Queue
```
