
package converting;

public class Converter extends javax.swing.JFrame {
    
    int ap =1;

    public Converter() {
        setTitle("Converter");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Input = new javax.swing.JTextField();
        ConvertType = new javax.swing.JButton();
        Output = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        Prev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Converter", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        Input.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Input.setForeground(new java.awt.Color(0, 102, 102));
        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });

        ConvertType.setBackground(new java.awt.Color(153, 255, 153));
        ConvertType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConvertType.setForeground(new java.awt.Color(0, 102, 102));
        ConvertType.setText("Infix to Postfix");
        ConvertType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertTypeActionPerformed(evt);
            }
        });

        Output.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Output.setForeground(new java.awt.Color(0, 102, 102));

        Next.setBackground(new java.awt.Color(204, 255, 153));
        Next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Next.setForeground(new java.awt.Color(51, 51, 0));
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Prev.setBackground(new java.awt.Color(204, 255, 153));
        Prev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Prev.setForeground(new java.awt.Color(51, 51, 0));
        Prev.setText("Prev");
        Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("De.Coder();");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jr.Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Output, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(Input))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConvertType, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ConvertType, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        if (ap == 1){
            ap++;
            ConvertType.setText("Postfix To Infix");
        }
        else if(ap == 2){
            ap++;
            ConvertType.setText("Infix To Prefix");
        }
        else if (ap == 3){
            ap++;
            ConvertType.setText("Prefix To Infix");
        }
        else if (ap == 4){
            ap++;
            ConvertType.setText("Prefix To Postfix");
        }
        else if (ap == 5){
            ap++;
            ConvertType.setText("Postfix To Prefix");
        }
        else if (ap == 6){
            ap = 1;
            ConvertType.setText("Infix To Postfix");
        }
    }//GEN-LAST:event_NextActionPerformed

    private void PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevActionPerformed
        if (ap == 1){
            ap = 6;
            ConvertType.setText("Postfix To Prefix");
        }
        else if(ap == 2){
            ap--;
            ConvertType.setText("Infix To Postfix");
        }
        else if (ap == 3){
            ap--;
            ConvertType.setText("Postfix To Infix");
        }
        else if (ap == 4){
            ap--;
            ConvertType.setText("Infix To Prefix");
        }
        else if (ap == 5){
            ap--;
            ConvertType.setText("Prefix To Infix");
        }
        else if (ap == 6){
            ap--;
            ConvertType.setText("Prefix To Postfix");
        }
    }//GEN-LAST:event_PrevActionPerformed

    private void ConvertTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertTypeActionPerformed

        String Type = ConvertType.getText();
        
        String InPo = "Infix To Postfix";
        String PoIn = "Postfix To Infix";
        String InPr = "Infix To Prefix";
        String PrIn = "Prefix To Infix";
        String PrPo = "Prefix To Postfix";
        String PoPr = "Postfix To Prefix";
        
        
        String input = Input.getText();
        String output = "";
        
        if (input.equalsIgnoreCase("")){
            Input.setText("Please Input a Phrase");
        }else{
        if (InPo.equalsIgnoreCase(Type)){
        char phraseArray[] = input.toCharArray();
        
        Stack stack = new Stack();
        
        for (int i=0 ; i<phraseArray.length ; i++){
            if (phraseArray[i] == '~'){
                stack.push(phraseArray[i]);
            }
            if((phraseArray[i] != '+') && (phraseArray[i] !='-') && (phraseArray[i] !='*') && (phraseArray[i]!='/') && (phraseArray[i] !='^') && (phraseArray[i] !='(') && (phraseArray[i] !=')') && (phraseArray[i] != '~')){
               output = output + String.valueOf(phraseArray[i]);
               if (stack.number !=0 && stack.top.c == '~'){
                    output = output + String.valueOf(stack.pop());
                }
            }
            if (phraseArray[i] == '('){
                stack.push(phraseArray[i]);
            }
            if (phraseArray[i] == ')'){
                for (int s = 0 ; s<10 ; s++){
                    char g = stack.pop();
                    if (g != '('){
                output = output + String.valueOf(g);
                    }
                    else 
                        break;
                }
            }
            if ((phraseArray[i] == '+') || (phraseArray[i] =='-') || (phraseArray[i] =='*') || (phraseArray[i]=='/') || (phraseArray[i] =='^')){
                if (stack.number == 0 || stack.top.c == '('){
                stack.push(phraseArray[i]);
                }else if (stack.number!=0){
                    if ((phraseArray[i] == '+' || phraseArray[i] == '-') && (stack.top.c == '+' || stack.top.c == '-')){
                       output = output + String.valueOf(stack.pop());
                        stack.push(phraseArray[i]);
                    }
                    else if ((stack.top.c == '*' || stack.top.c == '/' ) && (phraseArray[i] == '*' || phraseArray[i] == '/' )){
                        output = output + String.valueOf(stack.pop());
                        stack.push(phraseArray[i]);
                    }else if(stack.top.c == '^' && phraseArray[i] == '^'){
                        stack.push(phraseArray[i]);
                        
                    }else if((stack.top.c == '+' || stack.top.c == '-' ) && (phraseArray[i] == '*' || phraseArray[i] == '/' || phraseArray[i] == '^')){
                        stack.push(phraseArray[i]);
                   }else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && ((phraseArray[i] == '+') || (phraseArray[i] =='-'))){
                       while (stack.number != 0) {
                           output = output + String.valueOf(stack.pop());   
                       }
                           stack.push(phraseArray[i]);
                   }
                }
            }
        }
        if (stack.number !=0){
            while (stack.number != 0){
               output = output + String.valueOf(stack.pop());
            }
        }
        Output.setText(output);
        }
        
        if (PoIn.equalsIgnoreCase(Type)){
            
        char phraseArray[] = input.toCharArray();
        Stack1 stack1 = new Stack1();
        int n1 = 0 , n2 = 0;
        for (int i=0 ; i<phraseArray.length ; i++){
            if((phraseArray[i] != '+') && (phraseArray[i] !='-') && (phraseArray[i] !='*') && (phraseArray[i]!='/') && (phraseArray[i] !='^') && (phraseArray[i] !='(') && (phraseArray[i] !=')')){
                stack1.push(String.valueOf(phraseArray[i]));
            }
            else if ((phraseArray[i] == '+') || (phraseArray[i] =='-') || (phraseArray[i] =='*') || (phraseArray[i]=='/') || (phraseArray[i] =='^') || (phraseArray[i] =='(')){
                 String b;
               String a;
                String manfi = "~";
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    b = alamat + stack1.pop();
                }
                else 
                b = stack1.pop();
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    a = alamat +stack1.pop();
                }
                else{
                a = stack1.pop();
                }
                char c = phraseArray[i];
                if ((c == '+')||(c=='-')){
                        n2++;
                        }
                if ((c == '/')||(c == '*')||(c=='^')){
                        n1++;
                        }
               if (n1 >= 1 || n2>=2 ){
                    String p ="(" +a + String.valueOf(c) + b + ")";
                    stack1.push(p); 
                }
                else{
                String p = a + String.valueOf(c) + b;
                stack1.push(p);
                }
            }
            
        }
        Output.setText(stack1.pop());
        }
        
        if (InPr.equalsIgnoreCase(Type)){
        char phraseArray[] = input.toCharArray();
        char phraseArray1[] = new char[phraseArray.length];
        int j = phraseArray.length - 1;
        for (int i = 0 ; i < phraseArray1.length ; i++){
            phraseArray1[i] = phraseArray[j];
            j--;
        }
        for (int i=0 ; i< phraseArray1.length ; i++){
            if (phraseArray1[i] == '('){
                phraseArray1[i] = ')';
        }else if (phraseArray1[i] == ')'){
            phraseArray1[i] = '(';
        }   
        }
        Stack stack = new Stack();
        String s = "";
        for (int i=0 ; i<phraseArray1.length ; i++){
            if (phraseArray1[i] == '~'){
                s = s + String.valueOf(phraseArray1[i]);
            }
            if((phraseArray1[i] != '+') && (phraseArray1[i] !='-') && (phraseArray1[i] !='*') && (phraseArray1[i]!='/') && (phraseArray1[i] !='^') && (phraseArray1[i] !='(') && (phraseArray1[i] !=')')&& (phraseArray1[i] !='~')){
               s = s + String.valueOf(phraseArray1[i]);
            }
            if (phraseArray1[i] == '('){
                stack.push(phraseArray1[i]);
            }
            if (phraseArray1[i] == ')'){
                while(stack.top.c != '(')
                {
                    s = s + String.valueOf(stack.pop());
                }
                stack.pop();
            }
            if ((phraseArray1[i] == '+') || (phraseArray1[i] =='-') || (phraseArray1[i] =='*') || (phraseArray1[i]=='/') || (phraseArray1[i] =='^')){
                if (stack.number == 0 || stack.top.c == '('){
                stack.push(phraseArray1[i]);
                }else if (stack.number!=0){
                    if ((phraseArray1[i] == '+' || phraseArray1[i] == '-') && (stack.top.c == '+' || stack.top.c == '-')){
                        stack.push(phraseArray1[i]);
                    }
                    else if ((stack.top.c == '*' || stack.top.c == '/') && (phraseArray1[i] == '*' || phraseArray1[i] == '/')){
                       stack.push(phraseArray1[i]);
                        
                    }else if(stack.top.c == '^' && phraseArray1[i] == '^'){
                        s = s+ String.valueOf(stack.pop());
                        stack.push(phraseArray1[i]);
                    }else if((stack.top.c == '+' || stack.top.c == '-' ) && (phraseArray1[i] == '*' || phraseArray1[i] == '/' || phraseArray1[i] == '^')){
                        stack.push(phraseArray1[i]);
                   }else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && ((phraseArray1[i] == '+') || (phraseArray1[i] =='-'))){
                                s = s + String.valueOf(stack.pop()); 
                           stack.push(phraseArray1[i]);
                   }
                }
            }
        }
        if (stack.number !=0){
            while (stack.number != 0){
                s = s + String.valueOf(stack.pop());
            }
        }
            char s1[] = s.toCharArray();
            char s2[] = new char [s1.length];
            j = s1.length - 1;
            for (int i = 0 ; i<s1.length ; i++){
                s2[i] = s1[j];
                j--;
            }
            for (int i = 0 ; i<s2.length ; i++){
                output = output + s2[i];
            }
            
        Output.setText(output);
        }
        
        if (PrIn.equalsIgnoreCase(Type)){
        char phraseArray[] = input.toCharArray();
        char phraseArray1[] = new char [phraseArray.length];
        int j = phraseArray.length - 1;
        for (int i = 0 ; i < phraseArray1.length ; i++){
            phraseArray1[i] = phraseArray[j];
            j--;
        }
        Stack1 stack1 = new Stack1();
        int n1 = 0 , n2 = 0;
        for (int i=0 ; i<phraseArray1.length ; i++){
            
            if((phraseArray1[i] != '+') && (phraseArray1[i] !='-') && (phraseArray1[i] !='*') && (phraseArray1[i]!='/') && (phraseArray1[i] !='^') && (phraseArray1[i] !='(') && (phraseArray1[i] !=')')){
                stack1.push(String.valueOf(phraseArray1[i]));
            }
            else if ((phraseArray1[i] == '+') || (phraseArray1[i] =='-') || (phraseArray1[i] =='*') || (phraseArray1[i]=='/') || (phraseArray1[i] =='^') || (phraseArray1[i] =='(')){
               String b;
               String a;
                String manfi = "~";
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    b = stack1.pop() + alamat;
                }
                else 
                b = stack1.pop();
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    a = stack1.pop() + alamat;
                }
                else{
                a = stack1.pop();
                }
                char c = phraseArray1[i];
                if ((c == '+')||(c=='-')){
                        n2++;
                        }
                if ((c == '/')||(c == '*')||(c=='^')){
                        n1++;
                        }
               if (n1 >= 1 || n2>=2 ){
                    String p ="(" +a + String.valueOf(c) + b + ")";
                    stack1.push(p); 
                }
                else{
                String p = a + String.valueOf(c) + b;
                stack1.push(p);
                }
            }
            
        }
        String s =stack1.pop();
            char s1[] = s.toCharArray();
            char s2[] = new char [s1.length];
            j = s1.length - 1;
            for (int i = 0 ; i<s1.length ; i++){
                s2[i] = s1[j];
                j--;
            }
            for (int i=0 ; i< s2.length ; i++){
            if (s2[i] == '('){
                s2[i] = ')';
        }else if (s2[i] == ')'){
            s2[i] = '(';
        }   
        }
            System.out.print("\nInfix Phrase : ");
            for (int i = 0 ; i<s2.length ; i++){
                output = output + s2[i];
        }
            Output.setText(output);
        }
        
        if (PrPo.equalsIgnoreCase(Type)){
        char phraseArray[] = input.toCharArray();
        char phraseArray1[] = new char [phraseArray.length];
        int j = phraseArray.length - 1;
        for (int i = 0 ; i < phraseArray1.length ; i++){
            phraseArray1[i] = phraseArray[j];
            j--;
        }
        Stack1 stack1 = new Stack1();
        int n1=0 , n2=0;
        for (int i=0 ; i<phraseArray1.length ; i++){
            if((phraseArray1[i] != '+') && (phraseArray1[i] !='-') && (phraseArray1[i] !='*') && (phraseArray1[i]!='/') && (phraseArray1[i] !='^') && (phraseArray1[i] !='(') && (phraseArray1[i] !=')')){
                stack1.push(String.valueOf(phraseArray1[i]));
            }
            else if ((phraseArray1[i] == '+') || (phraseArray1[i] =='-') || (phraseArray1[i] =='*') || (phraseArray1[i]=='/') || (phraseArray1[i] =='^') || (phraseArray1[i] =='(')){
                String b = stack1.pop();
                String a = stack1.pop();
                char c = phraseArray1[i];
                if ((c == '+')||(c == '-')){
                        n2++;
                        }
                if ((c == '/')||(c == '*')||(c=='^')){
                        n1++;
                        }
                if (n1 >= 1 || n2>= 2){
                    String p ="(" +a + String.valueOf(c) + b + ")";
                    stack1.push(p); 
                }
                else{
                String p = a + String.valueOf(c) + b;
                stack1.push(p);
                }
            }
            
        }
        String s =stack1.pop();
            char s1[] = s.toCharArray();
            char s2[] = new char [s1.length];
            j = s1.length - 1;
            for (int i = 0 ; i<s1.length ; i++){
                s2[i] = s1[j];
                j--;
            }
            for (int i=0 ; i< s2.length ; i++){
            if (s2[i] == '('){
                s2[i] = ')';
        }else if (s2[i] == ')'){
            s2[i] = '(';
        }   
        }
            String s3 = "";
            for (int i = 0 ; i<s2.length ; i++){
            s3  =  s3 + String.valueOf(s2[i]);
            }
        char phraseArray2[] = s3.toCharArray();
        
        Stack stack = new Stack();
        
        for (int i=0 ; i<phraseArray2.length ; i++){
            if((phraseArray2[i] != '+') && (phraseArray2[i] !='-') && (phraseArray2[i] !='*') && (phraseArray2[i]!='/') && (phraseArray2[i] !='^') && (phraseArray2[i] !='(') && (phraseArray2[i] !=')')){
                output = output + String.valueOf(phraseArray2[i]);
            }
            if (phraseArray2[i] == '('){
                stack.push(phraseArray2[i]);
            }
            if (phraseArray2[i] == ')'){
                while(stack.top.c != '(')
                {
                    output = output + String.valueOf(stack.pop());
                }
                stack.pop();
            }
            if ((phraseArray2[i] == '+') || (phraseArray2[i] =='-') || (phraseArray2[i] =='*') || (phraseArray2[i]=='/') || (phraseArray2[i] =='^')){
                if (stack.number == 0 || stack.top.c == '('){
                stack.push(phraseArray2[i]);
                }else if (stack.number!=0){
                    if ((phraseArray2[i] == '+' || phraseArray2[i] == '-') && (stack.top.c == '+' || stack.top.c == '-')){
                       output = output + String.valueOf(stack.pop());
                        stack.push(phraseArray2[i]);
                    }
                    else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && (phraseArray2[i] == '*' || phraseArray2[i] == '/' || phraseArray2[i] == '^')){
                        output = output + String.valueOf(stack.pop());
                        stack.push(phraseArray2[i]);
                    }else if((stack.top.c == '+' || stack.top.c == '-' ) && (phraseArray2[i] == '*' || phraseArray2[i] == '/' || phraseArray2[i] == '^')){
                        stack.push(phraseArray2[i]);
                   }else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && ((phraseArray2[i] == '+') || (phraseArray2[i] =='-'))){
                                output = output + String.valueOf(stack.pop());   
                           stack.push(phraseArray2[i]);
                   }
                }
            }
        }
        if (stack.number !=0){
            while (stack.number != 0){
                output = output + String.valueOf(stack.pop());
            }
        }
        Output.setText(output);
        }
        if (PoPr.equalsIgnoreCase(Type)){
        char phraseArray[] = input.toCharArray();
        Stack1 stack1 = new Stack1();
        int n1 = 0 , n2 = 0;
        for (int i=0 ; i<phraseArray.length ; i++){
            if((phraseArray[i] != '+') && (phraseArray[i] !='-') && (phraseArray[i] !='*') && (phraseArray[i]!='/') && (phraseArray[i] !='^') && (phraseArray[i] !='(') && (phraseArray[i] !=')')){
                stack1.push(String.valueOf(phraseArray[i]));
            }
            else if ((phraseArray[i] == '+') || (phraseArray[i] =='-') || (phraseArray[i] =='*') || (phraseArray[i]=='/') || (phraseArray[i] =='^') || (phraseArray[i] =='(')){
               String b;
               String a;
                String manfi = "~";
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    b = alamat + stack1.pop();
                }
                else {
                b = stack1.pop();
                }
                if (stack1.top.s.equals(manfi)){
                    String alamat =  stack1.pop();
                    a = alamat +stack1.pop();
                }
                else{
                a = stack1.pop();
                }
                char c = phraseArray[i];
                if ((c == '+')||(c == '-')){
                        n2++;
                        }
                if ((c == '/')||(c == '*')||(c=='^')){
                        n1++;
                        }
                if (n1 >= 1 || n2 >=2){
                    String p ="(" +a + String.valueOf(c) + b + ")";
                    stack1.push(p); 
                }
                else{
                String p = a + String.valueOf(c) + b;
                stack1.push(p);
                }
            }
            
        }
        String input1 = stack1.pop();
        char ph[] = input1.toCharArray();
        char phraseArray2[] = new char[ph.length];
        int j = ph.length - 1;
        for (int i = 0 ; i < phraseArray2.length ; i++){
            phraseArray2[i] = ph[j];
            j--;
        }
        for (int i=0 ; i< phraseArray2.length ; i++){
            if (phraseArray2[i] == '('){
                phraseArray2[i] = ')';
        }else if (phraseArray2[i] == ')'){
            phraseArray2[i] = '(';
        }   
        }
        Stack stack = new Stack();
        
        String s = "";
        for (int i=0 ; i<phraseArray2.length ; i++){
                        if (phraseArray2[i] == '~'){
                s = s + String.valueOf(phraseArray2[i]);
            }
            if((phraseArray2[i] != '+') && (phraseArray2[i] !='-') && (phraseArray2[i] !='*') && (phraseArray2[i]!='/') && (phraseArray2[i] !='^') && (phraseArray2[i] !='(') && (phraseArray2[i] !=')') && (phraseArray2[i] != '~')){
                s = s + String.valueOf(phraseArray2[i]);
            }
            if (phraseArray2[i] == '('){
                stack.push(phraseArray2[i]);
            }
            if (phraseArray2[i] == ')'){
                while(stack.top.c != '(')
                {
                    s = s + String.valueOf(stack.pop());
                }
                stack.pop();
            }
            if ((phraseArray2[i] == '+') || (phraseArray2[i] =='-') || (phraseArray2[i] =='*') || (phraseArray2[i]=='/') || (phraseArray2[i] =='^')){
                if (stack.number == 0 || stack.top.c == '('){
                stack.push(phraseArray2[i]);
                }else if (stack.number!=0){
                    if ((phraseArray2[i] == '+' || phraseArray2[i] == '-') && (stack.top.c == '+' || stack.top.c == '-')){
                       s = s + String.valueOf(stack.pop());
                        stack.push(phraseArray2[i]);
                    }
                    else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && (phraseArray2[i] == '*' || phraseArray2[i] == '/' || phraseArray2[i] == '^')){
                       s = s + String.valueOf(stack.pop());
                        stack.push(phraseArray2[i]);
                    }else if((stack.top.c == '+' || stack.top.c == '-' ) && (phraseArray2[i] == '*' || phraseArray2[i] == '/' || phraseArray2[i] == '^')){
                        stack.push(phraseArray2[i]);
                   }else if ((stack.top.c == '*' || stack.top.c == '/' || stack.top.c == '^') && ((phraseArray2[i] == '+') || (phraseArray2[i] =='-'))){
                                s = s + String.valueOf(stack.pop()); 
                           stack.push(phraseArray2[i]);
                   }
                }
            }
        }
        if (stack.number !=0){
            while (stack.number != 0){
                s = s + String.valueOf(stack.pop());
            }
        }
            char s1[] = s.toCharArray();
            char s2[] = new char [s1.length];
            j = s1.length - 1;
            for (int i = 0 ; i<s1.length ; i++){
                s2[i] = s1[j];
                j--;
            }
            for (int i = 0 ; i<s2.length ; i++){
                output = output + s2[i];
            }
            
        Output.setText(output);
        }
        }
    }//GEN-LAST:event_ConvertTypeActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConvertType;
    private javax.swing.JTextField Input;
    private javax.swing.JButton Next;
    private javax.swing.JTextField Output;
    private javax.swing.JButton Prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
