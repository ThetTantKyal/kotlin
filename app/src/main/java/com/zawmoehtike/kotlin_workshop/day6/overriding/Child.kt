package day6.overriding

class Child : Parent() {
    override fun showToast() { // override method: parent class ထဲမှာ ရှိပြီးသား method ကိုပြန်ကြေညာတာ
        // super.showToast();
        println("Child's Toast")
    }

    override fun showProperties() { // override method: parent class ထဲမှာ ရှိပြီးသား method ကိုပြန်ကြေညာတာ
        super.showProperties()

        println("Phone, Laptop, Clothes")
    }
}