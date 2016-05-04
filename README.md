# multiplication-table
A benchmark to compare two different algorithms for printing of multiplication table 10x10.

## The results
There are at least two possible implementations:
 - **simple** - just one `for` inside the other `for`
 - **smart** - a little harder **single** (more details [here](src/com/extsoft/multiplication/table/SmartMultiplicationTable.java))

Execution log:
```
Loops count is 10:      simple: 9 ms;      smart: 4 ms;     The 'simple' method is 2,25 times slower the 'smart' method.
Loops count is 100:     simple: 34 ms;     smart: 13 ms;    The 'simple' method is 2,62 times slower the 'smart' method.
Loops count is 1000:    simple: 259 ms;    smart: 84 ms;    The 'simple' method is 3,08 times slower the 'smart' method.
Loops count is 10000:   simple: 1681 ms;   smart: 533 ms;   The 'simple' method is 3,15 times slower the 'smart' method.
Loops count is 100000:  simple: 13577 ms;  smart: 3137 ms;  The 'simple' method is 4,33 times slower the 'smart' method.
Loops count is 1000000: simple: 143320 ms; smart: 30497 ms; The 'simple' method is 4,70 times slower the 'smart' method.
```


## License
```
Copyright 2016 Dmytro Serdiuk <dmytro.serdiuk@gmail.com>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```