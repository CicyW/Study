## Readme文档 ##

### Replace Vowel Character 小游戏

### 需求说明 ###

本游戏是一个元音字母替换游戏，替换要求如下：对于一个给定的字符串，当该字符串格式符合要求时，如果其中元音字母个数所占比例大于或等于30%时，则将该元音字母替换成字符串mommy，额外的，在替换时，如果有连续的元音出现，则仅
替换一次。字符串格式要求是指只含有小写字母，即不包含大写字母，空格以及特殊字符。

### 任务分解 ###
根据以上要求，可将任务划分为以下三个需求：

- 字符串格式检查；；
- 元音字母百分占比计算；
- 将原字符串替换成新串。

### 字符串格式检查 ###

字符串格式检查可分为：字符串是否由全部由字母组成，串中是否包含空格，串中是否含大写字母。

将需求分成四个测试：

- 字符串是否由全部由字母组成，如果含有非字母字符，应该返回false；
- 串中是否包含空格，如果串中包含空格，应该返回true；
- 串中是否含大写字母，如果串中含大写字母，应该返回true；
- 字符串是否合法，如果输入字符串合法，应该返回true。

### 元音字母百分占比计算 ###

将需求分成两个测试：

- 字符串元音字母百分占比计算是否正确，如果字符串为"abce"，应该返回50%。
- 百分占比是否大于等于30%，如果字符串为"abce"，应该返回true。


### 将原字符串替换成新串 ###

将原字符串替换成新串包含两种替换：字符串中包含连续元音以及字符串中不含连续元音

将需求分成两个测试：

- 字符串包含连续元音，如"aece"，应该返回"mommycmommy"。
- 字符串不含连续元音，如"abce"，应该返回"mommybcmommy"。
