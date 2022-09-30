var global_num = 12;
var Numbers1 = /** @class */ (function () {
    function Numbers1() {
        this.num_val = 13;
    }
    Numbers1.prototype.storeNum = function () {
        var local_num = 14;
    };
    Numbers1.sval = 10;
    return Numbers1;
}());
console.log("Global num:" + global_num);
console.log(Numbers1.sval);
var obj = new Numbers1();
console.log("Global num: " + obj.num_val);
