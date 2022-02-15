// var array = [1, 3, 7];
// arrayDobrado = array.map((item) => item * 2);
// console.log(arrayDobrado);


const maca = { value: 2 };

const laranja = { value: 3 };

function mapComThis(arr, thisArg) {
    return arr.map(function (item){
        return item * this.value;
    }, thisArg);
}

const nums = [1, 2];

console.log('This -> Maçã', mapComThis(nums, maca));

console.log('This -> Laranja', mapComThis(nums, laranja));

/////////////

function mapSemThis(arr) {
    return arr.map(function (item) {
        return item * 2;
    });
}

const nums2 = [2, 5, 8, 10];

console.log(mapSemThis(nums2));