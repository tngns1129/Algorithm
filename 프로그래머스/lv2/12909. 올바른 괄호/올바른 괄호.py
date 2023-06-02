def solution(s):
    answer = True
    
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    ans_list = []
    for ch in s:
        if ch == '(':
            ans_list.append(ch)
        else:
            try:
                ans_list.pop()
            except:
                return False
    
    if len(ans_list) == 0:
        return True
    else:
        return False