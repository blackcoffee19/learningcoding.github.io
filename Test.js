class Test {
    constructor(par1,par2) {
        this._par1 = par1;
        this._par2 = par2;
        this.bool = true;
    }
    fun = () =>{
        if (this.bool){
            console.log(this._par1 + " and " + this._par2);
        } else (console.log("something wrong"));
    }
    get par1 () {
        return this._par1;
    }
    set setpar1(newpar){
        this._par1 = newpar;
    }
};
const examp1 = new Test(32, "test");
examp1.fun();
console.log(examp1.par1);
examp1.setpar1("aaaaa");
examp1.fun();
