### 該專案為近期學習JWT機制而實作的專案，尚未有Template模板渲染
### 提供下方api文件可於Postman進行測試。

# JWT Token
* 為登入驗證機制。保存期限因測試需求設置為1分鐘，提供token刷新功能。
* 登入成功後要在Header內帶入Authorization: Barer <token>，才能順利完成後續API呼叫

### 
* 登入token驗證接口

| 項目  |說明 |
| ------------- |:-------------:|
| API URL       | {server_domain}/api/login|
| method	      | POST(階層資料) |

* api/login: 登入token驗證接口，需輸入username、password
* api/token/refresh: token刷新接口


# API文件
* 皆須在Header內加入JWT token(Authorization: JWT <token>)

## 獲取所有用戶名單

| 項目  |說明 |
| ------------- |:-------------:|
| API URL       | {server_domain}/api/users|
| method	      | GET(階層資料) |

* Reqest:無
* Response: 

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| id   | Long    | 用戶 ID |
| name | String  | 用戶姓名 |
| username| String    | 用戶帳號名稱 |
| password   | String    | 用戶密碼 |

## 新增用戶
| 項目  |說明 |
| ------------- |:-------------:|
| API URL       | {server_domain}/api/user/save|
| method	      | POST(階層資料) |

* Reqest:

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| id   | Long    | 用戶ID並輸入null |
| name | String  | 用戶姓名 |
| username| String    | 用戶帳號名稱 |
| password   | String    | 用戶密碼 |

* Response: 

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| id   | Long    | 用戶 ID |
| name | String  | 用戶姓名 |
| username| String    | 用戶帳號名稱 |
| password   | String    | 用戶密碼 |

## 新增角色(role)
| 項目  |說明 |
| ------------- |:-------------:|
| API URL       | {server_domain}/api/role/save|
| method	      | POST(階層資料) |

* Reqest:

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| id   | Long    | 角色ID並輸入null |
| name | String  | 角色名稱 |


* Response: 

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| id   | Long    | 角色ID並輸入null |
| name | String  | 角色名稱 |


## 新增角色至用戶
| 項目  |說明 |
| ------------- |:-------------:|
| API URL       | {server_domain}/api/role/addtouser|
| method	      | POST(階層資料) |

* Reqest:

| 欄位  |資料類型 | 說明|
| ------------- |:-------------:|:-------------:|
| username   | String    | 用戶帳號名稱 |
| rolename | String  | 角色名稱 |


* Response: 無




