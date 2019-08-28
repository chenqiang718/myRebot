# myRebot
智能聊天机器人

采用图灵机器人API，对请求进行封装实现定制化
[图灵机器人](http://www.turingapi.com/)

**请求地址:**  http://wulang.xyz:8082/chat?content=你好
你好替换成你需要对聊天内容

***
返回事例：
```json
{
    "code": 10000,
    "msg": "成功",
    "data": {
        "reply": "你好啊!"
    }
}
```
**返回参数说明**

字段 | 类型 | 描述
--- | --- | ---
code | 数字 | 返回码(10000:成功，其它:不成功)
msg | 字符串 | 信息描述
reply | 字符串 | 对话内容
