int longestCommonSubsequence(String str1, String str2) {

    if (str1.length() == 0 || str2.length() == 0) return 0

    def lastX = str1[-1]
    def lastY = str2[-1]

    String preX, preY
    if (str1.length() == 1)
        preX = ""
    else
        preX = str1[0..-2]

    if (str2.length() == 1)
        preY = ""
    else
        preY = str2[0..-2]

    if (lastX == lastY)
        return longestCommonSubsequence(preX, preY) + 1
    else
        return Math.max(longestCommonSubsequence(str1, preY), longestCommonSubsequence(preX, str2))

}

assert longestCommonSubsequence('abcde', 'aceb') == 3
assert longestCommonSubsequence('qwerxcewfqdwe', 'qe') == 2
assert longestCommonSubsequence('qwerxcewfqdwe', 'qee') == 3


//def str = "1"
//println(str[-1])
//println(str[0..-2])
