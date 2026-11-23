# Cornelio_IT20--B

# Sorting Algorithms Activity

## What My Java Program Does
mag start akong program sa akong array na g declare nga naay 10 ka element nga unsorted o wla na arrange nga mga intigers (5, 3, 10, 2, 6, 8, 9, 1, 7, 4), kani. first nga i run sa akoong program is i print niya and unsorted nga list sa original nga array. then mag create sya ug 3 ka copy sa original nga array gamit ang keyword nga .clone(), Example: int[] bubbleCopy = arr.clone(); same pod dayun sa duwa ka method nga selectionSort ug insertionsort ,ingun ana.Then aya dayun tawagon ang 3 ka sorting function or method na g code para i sort in ascending order ang tagsatagsa ka copy sa original na unsorted array then i print dayun nila tagsatagsa ang ilang gipang sort nga copy sa Original na array katong unsorted.

## How Bubble Sort Works

ang bubble sort is kanang i compare niya ang iyang ka apad nga element "arr[j] and arr[j + 1]" kung mas daku ang left side kaysa tuo nga side or element, mag swap sila gamit ang "temp" nga variable ( 'int temp = arr[j];arr[j] = arr[j + 1];arr[j + 1] = temp;')ingani ang way niya pag mag swap na sila ug position, pero kung ang left side kai mas gamay sa right side, dili na sila mag swap kai sunod naman daan ang duwa naka asceding naman sila daan, mag loop ug mag move forward nlng dayun ang 'j' para mag compare npod sa sunod nga right side niya hantud sa ma arrange tanan.


## How Selection Sort Works

ang Selection sort is mag una sya sa first niya nga position unya kato una niya i declare nga smallest then iya dayun gina agi-an niya tanan unsorted element tagsatagsa tapus gina compare niya sa first niya nga position, dayun swap kung kato iyang na pili nga small is mas gamay sa first nga position, aya napod dayun mo loop ug mo forward sa next nga first position tapus balik npod dayun niya agi-an tanan para mangita ug kinagamayan hantud sa ma swap tanan ug ma arrange in a ascending order.


## How Insertion Sort Works

ang insertion sort is mag pili sya ug isa ka element ('key') ang tawag sa code, iyang pili-on ang nasa index nga '1' ug i compare dayun niya kung mas dako ang katong naa sa left side niya, tapus kung mas dayu ang nasa left niya, mo shift or mo isbug to ang nasa left side niya pa right kibali muarag mag swap sila ug position after nila mag shift, i compare npod dya sa left side niya nga tapad , hantud sa kung mas gamay na ang nasa left side niya or naa na sya sa pinaka tumoy na left, mag stop na dayun sya, kato npod dayun ang nasa atubangan nga mga wla pa na sort ang mag start ug cmopare sa iyang tapad na left.

## Differences Between the Three Sorting Algorithms
All three sort the array in ascending order, but they move elements differently:

- **Bubble Sort** i swap or baylo niya ang nag tapad nga pares bisan pag dili pa na order ug ayu ang tanan , mag padayun sya paingun sa tumoy
	          ug mag loop napod dayun sya para mag padayun ug compare ug swap.

- **Selection Sort** pangitaun niya ang pinaka gamay nga value sa na bilin nga unsorted nga part sa array ug mag swap ka isa kada isbug or lakbay sa outer na loop. 
			
- **Insertion Sort** I sibug niya ang dagko nga element after niya i compare sa current key, para ddto i butang ang key sa iyang sakto nga plastar. 



## Reflection Questions

### How does each sorting algorithm arrange numbers? What makes their processes different?
kada algorithm mag arrange sya sa mga numero gikan sa pinakagamay padulong sa pinakadako, pero lahi ang ilang mga steps. Sa Bubble Sort, mag-swap sya og mga magkatupad nga number while ga scan. Sa Selection Sort, mangita sya sa pinakagamay sa mga na bilin nga mga number ug i-swap sya sa sakto nga position. Sa Insertion Sort, i-shift niya ang mga nauna nga element aron ma-insert ang ang key sa iyang sakto nga plastor.

### Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?
Sayon2 ra ang Bubble Sort sa ako kay igo ra man mag-compare og duha ka magkatupad nga numero ug mag-swap kong mas dako ang naa sa wala. Sayon pod sundan ang Selection Sort kay mag-track ra ka og minIndex ug mag-swap kausa matag agi sa outer loop though dili kaayu nko sila kabisado sa code, ma sabtan2 ra nko innig basahon ang code ug ayu.

### If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.
Mas chada ug og performance ang Insertion Sort kong daan daw na plastar ang mga number kay ang condition sa while loop (arr[j] > key) kai dili na mag-trigger og pag-shift sa mga element, while ang Selection Sort check gihapon sa nabilin nga mga element para mangita og minIndex or kina gamayan.

### What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?
Kong mag add ug bag-o ang mga number, modaghan ang mga comparisons, shifts, ug swaps sulod sa mga loop kay nag nested loops man sila tanan, kung padakuon ang array, mas daghan og trabaho ug mas dugay mahuman ang kaning mga sorting alogorithm methods.

### As a future programmer, why is it important to understand different sorting algorithms instead of using just one?
lahi-lahi man gud ang need sa each nga mga program ug dataset, same sa kadako sa data, kong unsa na ka-sorted ang data, or kong pila ka swaps or shifts ang pwede mas chada man gud kung daghan klase2 nga algorithms imong na bal-an kai makatabang nga makapili ka og mas chada nga solution sa problem imbis nga mag rely ra ka sa isa ra ka way or pamaagi para sa tanan.
