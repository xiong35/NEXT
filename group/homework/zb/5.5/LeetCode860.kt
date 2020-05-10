class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var charge = 0
        var moneyOfFive = 0
        var moneyOfTen = 0
        var moneyOfTwenty = 0
        for (bill in bills)
        {
            when(bill){
                5->moneyOfFive++
                10->{
                    if (charge == 0 || moneyOfFive == 0)
                        return false
                    moneyOfFive--
                    moneyOfTen++
                }
                else->{
                    if (charge < 15 || moneyOfFive == 0 || (moneyOfFive < 3 && moneyOfTen == 0))
                        return false
                    if (moneyOfTen == 0)
                        moneyOfFive -= 3
                    if (moneyOfTen >= 1){
                        moneyOfFive--
                        moneyOfTen--
                    }
                    moneyOfTwenty++
                }
            }
            charge += 5
        }
        return true
    }
}