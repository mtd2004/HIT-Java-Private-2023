/*
Đoạn regex :
    ^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$
được sử dụng để kiểm tra tính hợp lệ của địa chỉ email. Vì
1. ^ và $ là các anchor (neo) đầu và cuối chuỗi, đảm bảo rằng toàn bộ chuỗi phải khớp với regex.

2. [\\w!#$%&’*+/=?{|}~^-]+` là một nhóm ký tự (character class) đại diện cho tên người dùng (username) trong địa chỉ email. Các thành phần bao gồm:

3. \\w đại diện cho các ký tự chữ cái, chữ số và dấu gạch dưới (_).
!#$%&’*+/=?{|}~^-` đại diện cho các ký tự đặc biệt mà có thể xuất hiện trong tên người dùng.
+ yêu cầu có ít nhất một ký tự từ nhóm trên.
(?:\\.[\\w!#$%&’*+/=?{|}~^-]+)*` là một nhóm không ghi nhớ (non-capturing group) đại diện cho tên miền (domain) trong địa chỉ email. Các thành phần bao gồm:

4. \\. đại diện cho dấu chấm (.) phân tách tên miền.
[\\w!#$%&’*+/=?{|}~^-]+` tương tự như trên, đại diện cho các ký tự có thể xuất hiện trong tên miền.
* cho phép nhóm trên xuất hiện 0 hoặc nhiều lần.
@(?:[a-zA-Z0-9-]+\\.)+ là một nhóm không ghi nhớ đại diện cho dấu @ và tên miền gốc (domain). Các thành phần bao gồm:

5. [a-zA-Z0-9-]+ đại diện cho các ký tự chữ cái, chữ số và dấu gạch ngang (-) có thể xuất hiện trong tên miền gốc.
\\. đại diện cho dấu chấm (.) phân tách tên miền gốc.
+ yêu cầu có ít nhất một tên miền gốc.
[a-zA-Z]{2,6} đại diện cho phần mở rộng tên miền (domain extension). Các thành phần bao gồm:

6. [a-zA-Z] đại diện cho các ký tự chữ cái, bao gồm cả chữ hoa và chữ thường.
{2,6} yêu cầu từ 2 đến 6 ký tự trong phần mở rộng tên miền.

*/