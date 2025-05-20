# CoffeeDiagnosis
Coffee app
```mermaid
graph TD
User((User))
top(コーヒー診断アプリ)
A(シチュエーション)
B(風味)
C(ホットかアイスか)
result[診断結果表示（いいね・いまいちボタン）]
D[アンケート入力]
E[(DB)]


User --> top
top --> A
subgraph 診断 
A --> B
B --> C
C --> result
end

result --> D
D --> E

%% DBとの関係補助線
top --> E
result --> E

```

![CoffeeDiagnosis_top](https://github.com/user-attachments/assets/341da896-f2aa-42b2-8af4-85f82dfb7891)
![CoffeeDiagnosis_question1](https://github.com/user-attachments/assets/af83974a-a219-4c2d-a986-d722e1255f11)
![CoffeeDiagnosis_question2](https://github.com/user-attachments/assets/9ec8464a-0f16-484a-8cae-c53b2b57c6b9)
![CoffeeDiagnosis_question3](https://github.com/user-attachments/assets/dfbe293a-386d-4149-94c9-d8b3e6009fb2)
![CoffeeDiagnosis_result](https://github.com/user-attachments/assets/c09da4c7-3b42-42c4-b08e-1bdf8c7ade64)


