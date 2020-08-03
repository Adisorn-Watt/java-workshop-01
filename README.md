## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
+ TC01 => create_new_buffer_should_empty
+ TC02 => create_new_buffer_with_default_size_should_10
+ TC03 => write_A_B_to_buffer_should_read_A_B_from_buffer
+ TC04 => write_A_read_A_then_write_B_read_B
+ TC05 => buffer_should_be_overwritten_at_buffer_size_10_by_writing_11_times
+ TC06 => buffer_should_be_overwritten_2nd_times_at_buffer_size_10_by_writing_21_times
+ TC07 => set_new_size_of_buffer_to_14_and_checking_it
