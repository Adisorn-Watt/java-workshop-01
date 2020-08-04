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

### Refactor Workshop-04
+ add getResultInTennisPattern() method then delete if condition in some method to decrease redundant of "if"

### Refactor Workshop-05
+ Replace Hard code
+ Introduce Variable to "isDeuce" case and recondition in "equal" case
+ Return value in "isDeuce" directly instead using "score" variable
+ Introduce Variable to "equal" case
+ Rename getResultInTennisPattern() method to textScores()
+ Return value in "equal" case directly instead using "score" variable
+ Introduce Variable to "Any score vs Love" cases for both sides of players
+ Return value directly in cases of "1 player have scored more than another player" for both side of players
+ Edit condition in cases of "Any point vs Love", also make them return value directly
+ Edit condition in cases of "Advantage", also make them return value directly
+ Make "Win" cases return value directly
+ Include 4 cases together :    
1,2 - "Any score vs Love"   
3,4 - "1 player have scored more than another player"   
by return them directly instead of return "score" variable at the end of the method
+ Delete old 4 cases which commented
+ Delete unuse variables
+ Introduce variable to "Win" and "Advantage" cases

