
package views;

import lib.SupportFunctions;

/**
 *
 * @author Gustavo
 */
public class WelcomeForm extends javax.swing.JFrame {
    
    private int xx = 0, xy = 0;
    private SupportFunctions support;
    
    public WelcomeForm() {
        
        // Inicializa todas las variables (o mejor dicho componentes) que usa el JFrame.
        initComponents();
        
        support = new SupportFunctions();
        
        support.initialOps(this);
        
        panWelcome.setBackground(new java.awt.Color(194, 48, 111));
        lblWelcome.setForeground(new java.awt.Color(255,230,240));
                
    }

    public void addEvents(java.awt.event.ActionListener evt){
        
        btnExit.addActionListener(evt);
        btnMin.addActionListener(evt);
        
        btnWelcome.addActionListener(evt);
        
        btnClearEnterprise.addActionListener(evt);
        btnDataUser.addActionListener(evt);
        
        btnBackEnterprise.addActionListener(evt);
        btnClearUser.addActionListener(evt);
        btnAccountUser.addActionListener(evt);
        
        btnSearchPhotoUser.addActionListener(evt);
        btnDeletePhotoUser.addActionListener(evt);
        btnBackUserData.addActionListener(evt);
        btnClearAccountUser.addActionListener(evt);
        btnConfirmUser.addActionListener(evt);
        tgbShowPass.addActionListener(evt);
        tgbShowPass1.addActionListener(evt);
        
        btnBackUser.addActionListener(evt);
        btnClearConfirm.addActionListener(evt);
        btnReady.addActionListener(evt);
        
        btnOk.addActionListener(evt);
               
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panWelcomeForm = new javax.swing.JPanel();
        panButtonsTopBar = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        panLateralMenu = new javax.swing.JPanel();
        panWelcome = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblWelcomIcon = new javax.swing.JLabel();
        panEnterpriseInfo = new javax.swing.JPanel();
        lblEnterprise = new javax.swing.JLabel();
        lblEnterpriseIcon = new javax.swing.JLabel();
        panData = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblDataIcon = new javax.swing.JLabel();
        panDataUser = new javax.swing.JPanel();
        lblDataUser = new javax.swing.JLabel();
        lblDataUserIcon = new javax.swing.JLabel();
        panDataConfirm = new javax.swing.JPanel();
        lblDataConfirm = new javax.swing.JLabel();
        lblDataConfirmIcon = new javax.swing.JLabel();
        panReady = new javax.swing.JPanel();
        lblReady = new javax.swing.JLabel();
        lblReadyIcon = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblCaelestiDevelopment = new javax.swing.JLabel();
        panCard = new javax.swing.JPanel();
        panWelcomeOp = new javax.swing.JPanel();
        lblLogoCosmetica = new javax.swing.JLabel();
        lblWelcomeText = new javax.swing.JLabel();
        panBtnWelcome = new javax.swing.JPanel();
        btnWelcome = new javax.swing.JButton();
        panEnterpriseOp = new javax.swing.JPanel();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        lblEnterpriseCode = new javax.swing.JLabel();
        txtEnterpriseCode = new javax.swing.JTextField();
        txtEnterpriseDescription = new javax.swing.JTextField();
        lblEnterpriseDescription = new javax.swing.JLabel();
        txtEnterpriseDirection = new javax.swing.JTextField();
        lblEnterpriseDirection = new javax.swing.JLabel();
        txtEnterprisePhone = new javax.swing.JTextField();
        lblEnterprisePhone = new javax.swing.JLabel();
        txtEnterpriseEmail = new javax.swing.JTextField();
        lblEnterpriseEmail = new javax.swing.JLabel();
        panBtnClearEnterprise = new javax.swing.JPanel();
        btnClearEnterprise = new javax.swing.JButton();
        panBtnDataUser = new javax.swing.JPanel();
        btnDataUser = new javax.swing.JButton();
        panDataOp = new javax.swing.JPanel();
        lblUserDNI = new javax.swing.JLabel();
        txtUserDNI = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblUserSurname = new javax.swing.JLabel();
        txtUserSurname = new javax.swing.JTextField();
        dtcUserBirthday = new com.toedter.calendar.JDateChooser();
        lblUserBirthday = new javax.swing.JLabel();
        lblUserPhone = new javax.swing.JLabel();
        txtUserPhone = new javax.swing.JTextField();
        lblUserDirection = new javax.swing.JLabel();
        txtUserDirection = new javax.swing.JTextField();
        panBtnBackEnterprise = new javax.swing.JPanel();
        btnBackEnterprise = new javax.swing.JButton();
        panBtnClearUser = new javax.swing.JPanel();
        btnClearUser = new javax.swing.JButton();
        panBtnAccountUser = new javax.swing.JPanel();
        btnAccountUser = new javax.swing.JButton();
        panDataUserOp = new javax.swing.JPanel();
        lblUserEmail = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        lblUserConfirmEmail = new javax.swing.JLabel();
        txtUserConfirmEmail = new javax.swing.JTextField();
        lblUserPassword = new javax.swing.JLabel();
        pssUser = new javax.swing.JPasswordField();
        tgbShowPass = new javax.swing.JToggleButton();
        lblUserPassword1 = new javax.swing.JLabel();
        pssUserConfirm = new javax.swing.JPasswordField();
        tgbShowPass1 = new javax.swing.JToggleButton();
        lblPhoto = new javax.swing.JLabel();
        lblUserPhoto = new javax.swing.JLabel();
        panBtnBackUserData = new javax.swing.JPanel();
        btnBackUserData = new javax.swing.JButton();
        panBtnClearAccountUser = new javax.swing.JPanel();
        btnClearAccountUser = new javax.swing.JButton();
        panBtnConfirmUser = new javax.swing.JPanel();
        btnConfirmUser = new javax.swing.JButton();
        panBtnSearchPhotoUser = new javax.swing.JPanel();
        btnSearchPhotoUser = new javax.swing.JButton();
        panBtnDeletePhotoUser = new javax.swing.JPanel();
        btnDeletePhotoUser = new javax.swing.JButton();
        txtPhotoPath = new javax.swing.JTextField();
        panConfirmOp = new javax.swing.JPanel();
        lblEmailConfirm = new javax.swing.JLabel();
        txtEmailConfirm = new javax.swing.JTextField();
        lblCodeConfirm = new javax.swing.JLabel();
        txtCodeConfirm = new javax.swing.JTextField();
        lblTextConfirm = new javax.swing.JLabel();
        panBtnBackUser = new javax.swing.JPanel();
        btnBackUser = new javax.swing.JButton();
        panBtnClearConfirm = new javax.swing.JPanel();
        btnClearConfirm = new javax.swing.JButton();
        panBtnReady = new javax.swing.JPanel();
        btnReady = new javax.swing.JButton();
        panReadyOp = new javax.swing.JPanel();
        lblReadyText = new javax.swing.JLabel();
        panBtnOk = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        lblLogoCosmetica1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panWelcomeForm.setBackground(new java.awt.Color(255, 245, 249));
        panWelcomeForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 144, 158)));
        panWelcomeForm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panWelcomeFormMouseDragged(evt);
            }
        });
        panWelcomeForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panWelcomeFormMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panWelcomeFormMouseReleased(evt);
            }
        });

        panButtonsTopBar.setBackground(new java.awt.Color(255, 245, 249));
        panButtonsTopBar.setPreferredSize(new java.awt.Dimension(215, 40));

        btnMin.setBackground(new java.awt.Color(255, 245, 249));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/medium/minIcon32.png"))); // NOI18N
        btnMin.setToolTipText("Minimizar");
        btnMin.setBorder(null);
        btnMin.setBorderPainted(false);
        btnMin.setContentAreaFilled(false);
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.setFocusPainted(false);
        btnMin.setOpaque(true);
        btnMin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMinMouseMoved(evt);
            }
        });
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 245, 249));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/medium/closeIcon32.png"))); // NOI18N
        btnExit.setToolTipText("Cerrar");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setOpaque(true);
        btnExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnExitMouseMoved(evt);
            }
        });
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panButtonsTopBarLayout = new javax.swing.GroupLayout(panButtonsTopBar);
        panButtonsTopBar.setLayout(panButtonsTopBarLayout);
        panButtonsTopBarLayout.setHorizontalGroup(
            panButtonsTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panButtonsTopBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(14, 14, 14))
        );
        panButtonsTopBarLayout.setVerticalGroup(
            panButtonsTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonsTopBarLayout.createSequentialGroup()
                .addGroup(panButtonsTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMin)
                    .addComponent(btnExit))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panLateralMenu.setBackground(new java.awt.Color(255, 230, 240));
        panLateralMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panLateralMenuMouseDragged(evt);
            }
        });
        panLateralMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panLateralMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panLateralMenuMouseReleased(evt);
            }
        });

        panWelcome.setBackground(new java.awt.Color(255, 230, 240));

        lblWelcome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
        lblWelcome.setText("Bienvenido");

        lblWelcomIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/homeIcon.png"))); // NOI18N
        lblWelcomIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panWelcomeLayout = new javax.swing.GroupLayout(panWelcome);
        panWelcome.setLayout(panWelcomeLayout);
        panWelcomeLayout.setHorizontalGroup(
            panWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panWelcomeLayout.setVerticalGroup(
            panWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panWelcomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWelcomIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        panEnterpriseInfo.setBackground(new java.awt.Color(255, 230, 240));

        lblEnterprise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        lblEnterprise.setText("Empresa");

        lblEnterpriseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterpriseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/enterpriseIcon.png"))); // NOI18N

        javax.swing.GroupLayout panEnterpriseInfoLayout = new javax.swing.GroupLayout(panEnterpriseInfo);
        panEnterpriseInfo.setLayout(panEnterpriseInfoLayout);
        panEnterpriseInfoLayout.setHorizontalGroup(
            panEnterpriseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEnterpriseInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterpriseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panEnterpriseInfoLayout.setVerticalGroup(
            panEnterpriseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEnterpriseInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panEnterpriseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEnterpriseIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        panData.setBackground(new java.awt.Color(255, 230, 240));

        lblData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setText("Datos de usuario");

        lblDataIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/formIcon.png"))); // NOI18N

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        panDataUser.setBackground(new java.awt.Color(255, 230, 240));

        lblDataUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDataUser.setForeground(new java.awt.Color(0, 0, 0));
        lblDataUser.setText("Cuenta de usuario");

        lblDataUserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/newUserIcon.png"))); // NOI18N

        javax.swing.GroupLayout panDataUserLayout = new javax.swing.GroupLayout(panDataUser);
        panDataUser.setLayout(panDataUserLayout);
        panDataUserLayout.setHorizontalGroup(
            panDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panDataUserLayout.setVerticalGroup(
            panDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDataUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataUserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        panDataConfirm.setBackground(new java.awt.Color(255, 230, 240));

        lblDataConfirm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDataConfirm.setForeground(new java.awt.Color(0, 0, 0));
        lblDataConfirm.setText("Confirmar usuario");

        lblDataConfirmIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataConfirmIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/gmailIcon.png"))); // NOI18N

        javax.swing.GroupLayout panDataConfirmLayout = new javax.swing.GroupLayout(panDataConfirm);
        panDataConfirm.setLayout(panDataConfirmLayout);
        panDataConfirmLayout.setHorizontalGroup(
            panDataConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataConfirmIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panDataConfirmLayout.setVerticalGroup(
            panDataConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataConfirmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panDataConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDataConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataConfirmIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        panReady.setBackground(new java.awt.Color(255, 230, 240));

        lblReady.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblReady.setForeground(new java.awt.Color(0, 0, 0));
        lblReady.setText("¡Listo!");

        lblReadyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReadyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/passIcon.png"))); // NOI18N

        javax.swing.GroupLayout panReadyLayout = new javax.swing.GroupLayout(panReady);
        panReady.setLayout(panReadyLayout);
        panReadyLayout.setHorizontalGroup(
            panReadyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panReadyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReadyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReady, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panReadyLayout.setVerticalGroup(
            panReadyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panReadyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panReadyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblReady, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReadyIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/giant/logoGiant.png"))); // NOI18N

        lblCaelestiDevelopment.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCaelestiDevelopment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/small/Caelesti Small.png"))); // NOI18N
        lblCaelestiDevelopment.setText("Caelesti Development");

        javax.swing.GroupLayout panLateralMenuLayout = new javax.swing.GroupLayout(panLateralMenu);
        panLateralMenu.setLayout(panLateralMenuLayout);
        panLateralMenuLayout.setHorizontalGroup(
            panLateralMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panDataUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panDataConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panReady, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panEnterpriseInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panLateralMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblCaelestiDevelopment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panLateralMenuLayout.setVerticalGroup(
            panLateralMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLateralMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(panWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panEnterpriseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDataConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panReady, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblCaelestiDevelopment))
        );

        panCard.setBackground(new java.awt.Color(255, 245, 249));
        panCard.setLayout(new java.awt.CardLayout());

        panWelcomeOp.setBackground(new java.awt.Color(255, 245, 249));

        lblLogoCosmetica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCosmetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/giant/Caelesti Management.png"))); // NOI18N

        lblWelcomeText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblWelcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeText.setText("<html><b><p align = 'CENTER'>Bienvenido a la aplicación de gestión de \"Caelesti Management\".<br><br>Con esta aplicación podrás gestionar los insumos que tienes, crear productos según los insumos que tengas, controlar y visualizar los gastos, ingresos e inversiones y otras cosas más.<br><br>Como es primer inicio de sesión, necesitaremos que nos indiques algunos datos sobre tu empresa y sobre ti, de esa manera prepararemos todo el entorno para que puedas comenzar a gestionar toda la empresa cómodamente.</p></html>");

        panBtnWelcome.setBackground(new java.awt.Color(254, 220, 234));

        btnWelcome.setBackground(new java.awt.Color(254, 220, 234));
        btnWelcome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnWelcome.setForeground(new java.awt.Color(0, 0, 0));
        btnWelcome.setText("Empecemos");
        btnWelcome.setBorder(null);
        btnWelcome.setBorderPainted(false);
        btnWelcome.setContentAreaFilled(false);
        btnWelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWelcome.setFocusPainted(false);
        btnWelcome.setFocusable(false);
        btnWelcome.setRequestFocusEnabled(false);
        btnWelcome.setVerifyInputWhenFocusTarget(false);
        btnWelcome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnWelcomeMouseMoved(evt);
            }
        });
        btnWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWelcomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnWelcomeLayout = new javax.swing.GroupLayout(panBtnWelcome);
        panBtnWelcome.setLayout(panBtnWelcomeLayout);
        panBtnWelcomeLayout.setHorizontalGroup(
            panBtnWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnWelcomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnWelcomeLayout.setVerticalGroup(
            panBtnWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnWelcomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panWelcomeOpLayout = new javax.swing.GroupLayout(panWelcomeOp);
        panWelcomeOp.setLayout(panWelcomeOpLayout);
        panWelcomeOpLayout.setHorizontalGroup(
            panWelcomeOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoCosmetica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panWelcomeOpLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(panWelcomeOpLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(panBtnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panWelcomeOpLayout.setVerticalGroup(
            panWelcomeOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWelcomeOpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogoCosmetica)
                .addGap(44, 44, 44)
                .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panBtnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        panCard.add(panWelcomeOp, "card2");

        panEnterpriseOp.setBackground(new java.awt.Color(255, 245, 249));

        lblEnterpriseName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterpriseName.setText("Nombre de la empresa: ");

        txtEnterpriseName.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterpriseName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterpriseName.setText("Orquídea. Cosmética Natural");
        txtEnterpriseName.setToolTipText("");
        txtEnterpriseName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterpriseName.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterpriseName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterpriseNameMouseClicked(evt);
            }
        });

        lblEnterpriseCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterpriseCode.setText("Código de la empresa:");

        txtEnterpriseCode.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterpriseCode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterpriseCode.setText("Ingresa el código de la empresa");
        txtEnterpriseCode.setToolTipText("");
        txtEnterpriseCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterpriseCode.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterpriseCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterpriseCodeMouseClicked(evt);
            }
        });

        txtEnterpriseDescription.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterpriseDescription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterpriseDescription.setText("Ingresa la descripción de la empresa");
        txtEnterpriseDescription.setToolTipText("");
        txtEnterpriseDescription.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterpriseDescription.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterpriseDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterpriseDescriptionMouseClicked(evt);
            }
        });

        lblEnterpriseDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterpriseDescription.setText("Descripción:");

        txtEnterpriseDirection.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterpriseDirection.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterpriseDirection.setText("Ingresa la dirección de la empresa");
        txtEnterpriseDirection.setToolTipText("");
        txtEnterpriseDirection.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterpriseDirection.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterpriseDirection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterpriseDirectionMouseClicked(evt);
            }
        });

        lblEnterpriseDirection.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterpriseDirection.setText("Dirección:");

        txtEnterprisePhone.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterprisePhone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterprisePhone.setText("Ingresa el número telefónico de la empresa");
        txtEnterprisePhone.setToolTipText("");
        txtEnterprisePhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterprisePhone.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterprisePhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterprisePhoneMouseClicked(evt);
            }
        });
        txtEnterprisePhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnterprisePhoneKeyTyped(evt);
            }
        });

        lblEnterprisePhone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterprisePhone.setText("Teléfono:");

        txtEnterpriseEmail.setBackground(new java.awt.Color(255, 245, 249));
        txtEnterpriseEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterpriseEmail.setText("Ingresa el correo electrónico de la empresa");
        txtEnterpriseEmail.setToolTipText("");
        txtEnterpriseEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEnterpriseEmail.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEnterpriseEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterpriseEmailMouseClicked(evt);
            }
        });

        lblEnterpriseEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnterpriseEmail.setText("Correo electrónico:");

        panBtnClearEnterprise.setBackground(new java.awt.Color(254, 220, 234));

        btnClearEnterprise.setBackground(new java.awt.Color(254, 220, 234));
        btnClearEnterprise.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        btnClearEnterprise.setText("Limpiar");
        btnClearEnterprise.setBorder(null);
        btnClearEnterprise.setBorderPainted(false);
        btnClearEnterprise.setContentAreaFilled(false);
        btnClearEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearEnterprise.setFocusPainted(false);
        btnClearEnterprise.setFocusable(false);
        btnClearEnterprise.setRequestFocusEnabled(false);
        btnClearEnterprise.setVerifyInputWhenFocusTarget(false);
        btnClearEnterprise.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClearEnterpriseMouseMoved(evt);
            }
        });
        btnClearEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearEnterpriseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnClearEnterpriseLayout = new javax.swing.GroupLayout(panBtnClearEnterprise);
        panBtnClearEnterprise.setLayout(panBtnClearEnterpriseLayout);
        panBtnClearEnterpriseLayout.setHorizontalGroup(
            panBtnClearEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearEnterpriseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnClearEnterpriseLayout.setVerticalGroup(
            panBtnClearEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearEnterpriseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnDataUser.setBackground(new java.awt.Color(254, 220, 234));

        btnDataUser.setBackground(new java.awt.Color(254, 220, 234));
        btnDataUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDataUser.setForeground(new java.awt.Color(0, 0, 0));
        btnDataUser.setText("Siguiente");
        btnDataUser.setBorder(null);
        btnDataUser.setBorderPainted(false);
        btnDataUser.setContentAreaFilled(false);
        btnDataUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataUser.setFocusPainted(false);
        btnDataUser.setFocusable(false);
        btnDataUser.setRequestFocusEnabled(false);
        btnDataUser.setVerifyInputWhenFocusTarget(false);
        btnDataUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDataUserMouseMoved(evt);
            }
        });
        btnDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnDataUserLayout = new javax.swing.GroupLayout(panBtnDataUser);
        panBtnDataUser.setLayout(panBtnDataUserLayout);
        panBtnDataUserLayout.setHorizontalGroup(
            panBtnDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnDataUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnDataUserLayout.setVerticalGroup(
            panBtnDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnDataUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panEnterpriseOpLayout = new javax.swing.GroupLayout(panEnterpriseOp);
        panEnterpriseOp.setLayout(panEnterpriseOpLayout);
        panEnterpriseOpLayout.setHorizontalGroup(
            panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEnterpriseOpLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                        .addComponent(lblEnterpriseEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEnterpriseEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                        .addComponent(lblEnterprisePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEnterprisePhone))
                    .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                        .addComponent(lblEnterpriseDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEnterpriseDirection))
                    .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                        .addComponent(lblEnterpriseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEnterpriseDescription))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEnterpriseOpLayout.createSequentialGroup()
                        .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEnterpriseOpLayout.createSequentialGroup()
                                .addComponent(lblEnterpriseName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                                .addComponent(lblEnterpriseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEnterpriseCode)
                            .addComponent(txtEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addGap(54, 54, 54))
            .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(panBtnClearEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEnterpriseOpLayout.setVerticalGroup(
            panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEnterpriseOpLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprisePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterprisePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panEnterpriseOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panBtnClearEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panBtnDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panCard.add(panEnterpriseOp, "card3");

        panDataOp.setBackground(new java.awt.Color(255, 245, 249));
        panDataOp.setFocusable(false);
        panDataOp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUserDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserDNI.setText("Documento de Identificación: ");

        txtUserDNI.setBackground(new java.awt.Color(255, 245, 249));
        txtUserDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserDNI.setText("Ingresa tu documento de identificación");
        txtUserDNI.setToolTipText("");
        txtUserDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserDNI.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserDNIMouseClicked(evt);
            }
        });

        txtUserName.setBackground(new java.awt.Color(255, 245, 249));
        txtUserName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserName.setText("Ingresa tu nombre");
        txtUserName.setToolTipText("");
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserName.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName.setText("Nombre:");

        lblUserSurname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserSurname.setText("Apellido: ");

        txtUserSurname.setBackground(new java.awt.Color(255, 245, 249));
        txtUserSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserSurname.setText("Ingresa tu apellido");
        txtUserSurname.setToolTipText("");
        txtUserSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserSurname.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserSurname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserSurnameMouseClicked(evt);
            }
        });

        dtcUserBirthday.setBackground(new java.awt.Color(255, 245, 249));
        dtcUserBirthday.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        dtcUserBirthday.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dtcUserBirthday.setOpaque(false);

        lblUserBirthday.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserBirthday.setText("Fecha de nacimiento:");

        lblUserPhone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserPhone.setText("Teléfono: ");

        txtUserPhone.setBackground(new java.awt.Color(255, 245, 249));
        txtUserPhone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserPhone.setText("Ingresa tu número telefónico");
        txtUserPhone.setToolTipText("");
        txtUserPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserPhone.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserPhoneMouseClicked(evt);
            }
        });
        txtUserPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserPhoneKeyTyped(evt);
            }
        });

        lblUserDirection.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserDirection.setText("Dirección: ");

        txtUserDirection.setBackground(new java.awt.Color(255, 245, 249));
        txtUserDirection.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserDirection.setText("Ingresa tu dirección");
        txtUserDirection.setToolTipText("");
        txtUserDirection.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserDirection.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserDirection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserDirectionMouseClicked(evt);
            }
        });

        panBtnBackEnterprise.setBackground(new java.awt.Color(254, 220, 234));

        btnBackEnterprise.setBackground(new java.awt.Color(254, 220, 234));
        btnBackEnterprise.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        btnBackEnterprise.setText("Atrás");
        btnBackEnterprise.setBorder(null);
        btnBackEnterprise.setBorderPainted(false);
        btnBackEnterprise.setContentAreaFilled(false);
        btnBackEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackEnterprise.setFocusPainted(false);
        btnBackEnterprise.setFocusable(false);
        btnBackEnterprise.setRequestFocusEnabled(false);
        btnBackEnterprise.setVerifyInputWhenFocusTarget(false);
        btnBackEnterprise.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBackEnterpriseMouseMoved(evt);
            }
        });
        btnBackEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackEnterpriseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnBackEnterpriseLayout = new javax.swing.GroupLayout(panBtnBackEnterprise);
        panBtnBackEnterprise.setLayout(panBtnBackEnterpriseLayout);
        panBtnBackEnterpriseLayout.setHorizontalGroup(
            panBtnBackEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackEnterpriseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnBackEnterpriseLayout.setVerticalGroup(
            panBtnBackEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackEnterpriseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnClearUser.setBackground(new java.awt.Color(254, 220, 234));

        btnClearUser.setBackground(new java.awt.Color(254, 220, 234));
        btnClearUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearUser.setForeground(new java.awt.Color(0, 0, 0));
        btnClearUser.setText("Limpiar");
        btnClearUser.setBorder(null);
        btnClearUser.setBorderPainted(false);
        btnClearUser.setContentAreaFilled(false);
        btnClearUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearUser.setFocusPainted(false);
        btnClearUser.setFocusable(false);
        btnClearUser.setRequestFocusEnabled(false);
        btnClearUser.setVerifyInputWhenFocusTarget(false);
        btnClearUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClearUserMouseMoved(evt);
            }
        });
        btnClearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnClearUserLayout = new javax.swing.GroupLayout(panBtnClearUser);
        panBtnClearUser.setLayout(panBtnClearUserLayout);
        panBtnClearUserLayout.setHorizontalGroup(
            panBtnClearUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnClearUserLayout.setVerticalGroup(
            panBtnClearUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnAccountUser.setBackground(new java.awt.Color(254, 220, 234));

        btnAccountUser.setBackground(new java.awt.Color(254, 220, 234));
        btnAccountUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAccountUser.setForeground(new java.awt.Color(0, 0, 0));
        btnAccountUser.setText("Siguiente");
        btnAccountUser.setBorder(null);
        btnAccountUser.setBorderPainted(false);
        btnAccountUser.setContentAreaFilled(false);
        btnAccountUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccountUser.setFocusPainted(false);
        btnAccountUser.setFocusable(false);
        btnAccountUser.setRequestFocusEnabled(false);
        btnAccountUser.setVerifyInputWhenFocusTarget(false);
        btnAccountUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAccountUserMouseMoved(evt);
            }
        });
        btnAccountUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccountUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnAccountUserLayout = new javax.swing.GroupLayout(panBtnAccountUser);
        panBtnAccountUser.setLayout(panBtnAccountUserLayout);
        panBtnAccountUserLayout.setHorizontalGroup(
            panBtnAccountUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnAccountUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnAccountUserLayout.setVerticalGroup(
            panBtnAccountUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnAccountUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panDataOpLayout = new javax.swing.GroupLayout(panDataOp);
        panDataOp.setLayout(panDataOpLayout);
        panDataOpLayout.setHorizontalGroup(
            panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataOpLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panDataOpLayout.createSequentialGroup()
                        .addComponent(panBtnBackEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(panDataOpLayout.createSequentialGroup()
                        .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUserDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserPhone)
                            .addComponent(txtUserDNI)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtUserSurname)
                            .addComponent(dtcUserBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserDirection))))
                .addGap(41, 41, 41))
        );
        panDataOpLayout.setVerticalGroup(
            panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataOpLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txtUserSurname))
                .addGap(18, 18, 18)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtcUserBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panDataOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panBtnClearUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnAccountUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnBackEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        panCard.add(panDataOp, "card4");

        panDataUserOp.setBackground(new java.awt.Color(255, 245, 249));

        lblUserEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserEmail.setText("Correo electrónico: ");

        txtUserEmail.setBackground(new java.awt.Color(255, 245, 249));
        txtUserEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserEmail.setText("Ingresa tu correo electrónico");
        txtUserEmail.setToolTipText("");
        txtUserEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserEmail.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserEmailMouseClicked(evt);
            }
        });

        lblUserConfirmEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserConfirmEmail.setText("Confirma el correo electrónico: ");

        txtUserConfirmEmail.setBackground(new java.awt.Color(255, 245, 249));
        txtUserConfirmEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUserConfirmEmail.setText("Ingresa nuevamente tu correo electrónico");
        txtUserConfirmEmail.setToolTipText("");
        txtUserConfirmEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtUserConfirmEmail.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtUserConfirmEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserConfirmEmailMouseClicked(evt);
            }
        });

        lblUserPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserPassword.setText("Contraseña:");

        pssUser.setBackground(new java.awt.Color(255, 245, 249));
        pssUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pssUser.setText("Ingresa tu contraseña");
        pssUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        pssUser.setEchoChar('*');
        pssUser.setSelectionColor(new java.awt.Color(0, 144, 158));
        pssUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pssUserMouseClicked(evt);
            }
        });

        tgbShowPass.setBackground(new java.awt.Color(255, 245, 249));
        tgbShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/hideIcon.png"))); // NOI18N
        tgbShowPass.setBorder(null);
        tgbShowPass.setBorderPainted(false);
        tgbShowPass.setContentAreaFilled(false);
        tgbShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbShowPass.setFocusPainted(false);
        tgbShowPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/showIcon.png"))); // NOI18N

        lblUserPassword1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserPassword1.setText("Confirma la contraseña:");

        pssUserConfirm.setBackground(new java.awt.Color(255, 245, 249));
        pssUserConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pssUserConfirm.setText("Ingresa tu contraseña");
        pssUserConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        pssUserConfirm.setEchoChar('*');
        pssUserConfirm.setSelectionColor(new java.awt.Color(0, 144, 158));
        pssUserConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pssUserConfirmMouseClicked(evt);
            }
        });

        tgbShowPass1.setBackground(new java.awt.Color(255, 245, 249));
        tgbShowPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/hideIcon.png"))); // NOI18N
        tgbShowPass1.setBorder(null);
        tgbShowPass1.setBorderPainted(false);
        tgbShowPass1.setContentAreaFilled(false);
        tgbShowPass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbShowPass1.setFocusPainted(false);
        tgbShowPass1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/large/showIcon.png"))); // NOI18N

        lblPhoto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setText("Sin imagen");
        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 144, 158)));

        lblUserPhoto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserPhoto.setText("Foto de perfil:");

        panBtnBackUserData.setBackground(new java.awt.Color(254, 220, 234));

        btnBackUserData.setBackground(new java.awt.Color(254, 220, 234));
        btnBackUserData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackUserData.setForeground(new java.awt.Color(0, 0, 0));
        btnBackUserData.setText("Atrás");
        btnBackUserData.setBorder(null);
        btnBackUserData.setBorderPainted(false);
        btnBackUserData.setContentAreaFilled(false);
        btnBackUserData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackUserData.setFocusPainted(false);
        btnBackUserData.setFocusable(false);
        btnBackUserData.setRequestFocusEnabled(false);
        btnBackUserData.setVerifyInputWhenFocusTarget(false);
        btnBackUserData.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBackUserDataMouseMoved(evt);
            }
        });
        btnBackUserData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackUserDataMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnBackUserDataLayout = new javax.swing.GroupLayout(panBtnBackUserData);
        panBtnBackUserData.setLayout(panBtnBackUserDataLayout);
        panBtnBackUserDataLayout.setHorizontalGroup(
            panBtnBackUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackUserDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnBackUserDataLayout.setVerticalGroup(
            panBtnBackUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackUserDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnClearAccountUser.setBackground(new java.awt.Color(254, 220, 234));

        btnClearAccountUser.setBackground(new java.awt.Color(254, 220, 234));
        btnClearAccountUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearAccountUser.setForeground(new java.awt.Color(0, 0, 0));
        btnClearAccountUser.setText("Limpiar");
        btnClearAccountUser.setBorder(null);
        btnClearAccountUser.setBorderPainted(false);
        btnClearAccountUser.setContentAreaFilled(false);
        btnClearAccountUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearAccountUser.setFocusPainted(false);
        btnClearAccountUser.setFocusable(false);
        btnClearAccountUser.setRequestFocusEnabled(false);
        btnClearAccountUser.setVerifyInputWhenFocusTarget(false);
        btnClearAccountUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClearAccountUserMouseMoved(evt);
            }
        });
        btnClearAccountUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearAccountUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnClearAccountUserLayout = new javax.swing.GroupLayout(panBtnClearAccountUser);
        panBtnClearAccountUser.setLayout(panBtnClearAccountUserLayout);
        panBtnClearAccountUserLayout.setHorizontalGroup(
            panBtnClearAccountUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearAccountUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnClearAccountUserLayout.setVerticalGroup(
            panBtnClearAccountUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearAccountUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnConfirmUser.setBackground(new java.awt.Color(254, 220, 234));

        btnConfirmUser.setBackground(new java.awt.Color(254, 220, 234));
        btnConfirmUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfirmUser.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmUser.setText("Siguiente");
        btnConfirmUser.setBorder(null);
        btnConfirmUser.setBorderPainted(false);
        btnConfirmUser.setContentAreaFilled(false);
        btnConfirmUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmUser.setFocusPainted(false);
        btnConfirmUser.setFocusable(false);
        btnConfirmUser.setRequestFocusEnabled(false);
        btnConfirmUser.setVerifyInputWhenFocusTarget(false);
        btnConfirmUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConfirmUserMouseMoved(evt);
            }
        });
        btnConfirmUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnConfirmUserLayout = new javax.swing.GroupLayout(panBtnConfirmUser);
        panBtnConfirmUser.setLayout(panBtnConfirmUserLayout);
        panBtnConfirmUserLayout.setHorizontalGroup(
            panBtnConfirmUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnConfirmUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConfirmUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnConfirmUserLayout.setVerticalGroup(
            panBtnConfirmUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnConfirmUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConfirmUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnSearchPhotoUser.setBackground(new java.awt.Color(254, 220, 234));

        btnSearchPhotoUser.setBackground(new java.awt.Color(254, 220, 234));
        btnSearchPhotoUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSearchPhotoUser.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchPhotoUser.setText("Buscar");
        btnSearchPhotoUser.setBorder(null);
        btnSearchPhotoUser.setBorderPainted(false);
        btnSearchPhotoUser.setContentAreaFilled(false);
        btnSearchPhotoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchPhotoUser.setFocusPainted(false);
        btnSearchPhotoUser.setFocusable(false);
        btnSearchPhotoUser.setRequestFocusEnabled(false);
        btnSearchPhotoUser.setVerifyInputWhenFocusTarget(false);
        btnSearchPhotoUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSearchPhotoUserMouseMoved(evt);
            }
        });
        btnSearchPhotoUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchPhotoUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnSearchPhotoUserLayout = new javax.swing.GroupLayout(panBtnSearchPhotoUser);
        panBtnSearchPhotoUser.setLayout(panBtnSearchPhotoUserLayout);
        panBtnSearchPhotoUserLayout.setHorizontalGroup(
            panBtnSearchPhotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearchPhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panBtnSearchPhotoUserLayout.setVerticalGroup(
            panBtnSearchPhotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearchPhotoUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panBtnDeletePhotoUser.setBackground(new java.awt.Color(254, 220, 234));

        btnDeletePhotoUser.setBackground(new java.awt.Color(254, 220, 234));
        btnDeletePhotoUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeletePhotoUser.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletePhotoUser.setText("Eliminar");
        btnDeletePhotoUser.setBorder(null);
        btnDeletePhotoUser.setBorderPainted(false);
        btnDeletePhotoUser.setContentAreaFilled(false);
        btnDeletePhotoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletePhotoUser.setFocusPainted(false);
        btnDeletePhotoUser.setFocusable(false);
        btnDeletePhotoUser.setRequestFocusEnabled(false);
        btnDeletePhotoUser.setVerifyInputWhenFocusTarget(false);
        btnDeletePhotoUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDeletePhotoUserMouseMoved(evt);
            }
        });
        btnDeletePhotoUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletePhotoUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnDeletePhotoUserLayout = new javax.swing.GroupLayout(panBtnDeletePhotoUser);
        panBtnDeletePhotoUser.setLayout(panBtnDeletePhotoUserLayout);
        panBtnDeletePhotoUserLayout.setHorizontalGroup(
            panBtnDeletePhotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnDeletePhotoUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeletePhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnDeletePhotoUserLayout.setVerticalGroup(
            panBtnDeletePhotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnDeletePhotoUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeletePhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtPhotoPath.setEditable(false);
        txtPhotoPath.setBackground(new java.awt.Color(255, 245, 249));
        txtPhotoPath.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPhotoPath.setText("Ruta de la imagen");
        txtPhotoPath.setToolTipText("");
        txtPhotoPath.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtPhotoPath.setSelectionColor(new java.awt.Color(0, 144, 158));

        javax.swing.GroupLayout panDataUserOpLayout = new javax.swing.GroupLayout(panDataUserOp);
        panDataUserOp.setLayout(panDataUserOpLayout);
        panDataUserOpLayout.setHorizontalGroup(
            panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataUserOpLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panDataUserOpLayout.createSequentialGroup()
                        .addComponent(panBtnBackUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnClearAccountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnConfirmUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDataUserOpLayout.createSequentialGroup()
                        .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserConfirmEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panDataUserOpLayout.createSequentialGroup()
                                    .addComponent(pssUser, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tgbShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panDataUserOpLayout.createSequentialGroup()
                                    .addComponent(pssUserConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tgbShowPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtUserConfirmEmail))
                            .addComponent(txtUserEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panDataUserOpLayout.createSequentialGroup()
                        .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDataUserOpLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(panBtnSearchPhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panBtnDeletePhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDataUserOpLayout.createSequentialGroup()
                                .addComponent(lblUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        panDataUserOpLayout.setVerticalGroup(
            panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataUserOpLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDataUserOpLayout.createSequentialGroup()
                        .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panBtnDeletePhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panBtnSearchPhotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pssUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tgbShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUserPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pssUserConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tgbShowPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panDataUserOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panBtnClearAccountUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnConfirmUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnBackUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        panCard.add(panDataUserOp, "card5");

        panConfirmOp.setBackground(new java.awt.Color(255, 245, 249));

        lblEmailConfirm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEmailConfirm.setText("Correo electrónico: ");

        txtEmailConfirm.setBackground(new java.awt.Color(255, 245, 249));
        txtEmailConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmailConfirm.setText("Ingresa tu correo electrónico");
        txtEmailConfirm.setToolTipText("");
        txtEmailConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtEmailConfirm.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtEmailConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailConfirmMouseClicked(evt);
            }
        });

        lblCodeConfirm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodeConfirm.setText("Código de verificación:");

        txtCodeConfirm.setBackground(new java.awt.Color(255, 245, 249));
        txtCodeConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodeConfirm.setText("Ingresa el código de verificación");
        txtCodeConfirm.setToolTipText("");
        txtCodeConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 144, 158)));
        txtCodeConfirm.setSelectionColor(new java.awt.Color(0, 144, 158));
        txtCodeConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodeConfirmMouseClicked(evt);
            }
        });

        lblTextConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTextConfirm.setText("<html><b><p align = 'CENTER'>Se te ha enviado un código de verificación al correo electrónico que proporcionaste en la etapa anterior. Por favor, ingresa el correo electrónico y el código de verificación para culminar el proceso de registro.<br><br>En el caso de que no hayas recibido el correo electrónico vuelve a la etapa anterior y verifica que los datos proporcionados sean correctos o, comprueba si tienes conexión a internet.</p></html>");

        panBtnBackUser.setBackground(new java.awt.Color(254, 220, 234));

        btnBackUser.setBackground(new java.awt.Color(254, 220, 234));
        btnBackUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackUser.setForeground(new java.awt.Color(0, 0, 0));
        btnBackUser.setText("Atrás");
        btnBackUser.setBorder(null);
        btnBackUser.setBorderPainted(false);
        btnBackUser.setContentAreaFilled(false);
        btnBackUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackUser.setFocusPainted(false);
        btnBackUser.setFocusable(false);
        btnBackUser.setRequestFocusEnabled(false);
        btnBackUser.setVerifyInputWhenFocusTarget(false);
        btnBackUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBackUserMouseMoved(evt);
            }
        });
        btnBackUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnBackUserLayout = new javax.swing.GroupLayout(panBtnBackUser);
        panBtnBackUser.setLayout(panBtnBackUserLayout);
        panBtnBackUserLayout.setHorizontalGroup(
            panBtnBackUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnBackUserLayout.setVerticalGroup(
            panBtnBackUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnBackUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnClearConfirm.setBackground(new java.awt.Color(254, 220, 234));

        btnClearConfirm.setBackground(new java.awt.Color(254, 220, 234));
        btnClearConfirm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnClearConfirm.setText("Limpiar");
        btnClearConfirm.setBorder(null);
        btnClearConfirm.setBorderPainted(false);
        btnClearConfirm.setContentAreaFilled(false);
        btnClearConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearConfirm.setFocusPainted(false);
        btnClearConfirm.setFocusable(false);
        btnClearConfirm.setRequestFocusEnabled(false);
        btnClearConfirm.setVerifyInputWhenFocusTarget(false);
        btnClearConfirm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClearConfirmMouseMoved(evt);
            }
        });
        btnClearConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearConfirmMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnClearConfirmLayout = new javax.swing.GroupLayout(panBtnClearConfirm);
        panBtnClearConfirm.setLayout(panBtnClearConfirmLayout);
        panBtnClearConfirmLayout.setHorizontalGroup(
            panBtnClearConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearConfirmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnClearConfirmLayout.setVerticalGroup(
            panBtnClearConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnClearConfirmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClearConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panBtnReady.setBackground(new java.awt.Color(254, 220, 234));

        btnReady.setBackground(new java.awt.Color(254, 220, 234));
        btnReady.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReady.setForeground(new java.awt.Color(0, 0, 0));
        btnReady.setText("Siguiente");
        btnReady.setBorder(null);
        btnReady.setBorderPainted(false);
        btnReady.setContentAreaFilled(false);
        btnReady.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReady.setFocusPainted(false);
        btnReady.setFocusable(false);
        btnReady.setRequestFocusEnabled(false);
        btnReady.setVerifyInputWhenFocusTarget(false);
        btnReady.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnReadyMouseMoved(evt);
            }
        });
        btnReady.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReadyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnReadyLayout = new javax.swing.GroupLayout(panBtnReady);
        panBtnReady.setLayout(panBtnReadyLayout);
        panBtnReadyLayout.setHorizontalGroup(
            panBtnReadyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnReadyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReady, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnReadyLayout.setVerticalGroup(
            panBtnReadyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnReadyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReady, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panConfirmOpLayout = new javax.swing.GroupLayout(panConfirmOp);
        panConfirmOp.setLayout(panConfirmOpLayout);
        panConfirmOpLayout.setHorizontalGroup(
            panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConfirmOpLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConfirmOpLayout.createSequentialGroup()
                        .addComponent(panBtnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnClearConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBtnReady, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panConfirmOpLayout.createSequentialGroup()
                        .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panConfirmOpLayout.createSequentialGroup()
                                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodeConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmailConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))))
        );
        panConfirmOpLayout.setVerticalGroup(
            panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConfirmOpLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblTextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(panConfirmOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panBtnClearConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnReady, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBtnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        panCard.add(panConfirmOp, "card6");

        panReadyOp.setBackground(new java.awt.Color(255, 245, 249));

        lblReadyText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblReadyText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReadyText.setText("<html><b><p align = 'CENTER'>Ya hemos registrado la información necesaria para el funcionamiento de la aplicación, has click en el botón de abajo para iniciar sesión con la cuenta que has creado y podrás comenzar a gestionar tu empresa sin más preámbulos.<br><br>¡Te damos la bienvenida!</p></html>");

        panBtnOk.setBackground(new java.awt.Color(254, 220, 234));

        btnOk.setBackground(new java.awt.Color(254, 220, 234));
        btnOk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 0, 0));
        btnOk.setText("Aceptar");
        btnOk.setBorder(null);
        btnOk.setBorderPainted(false);
        btnOk.setContentAreaFilled(false);
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setFocusPainted(false);
        btnOk.setFocusable(false);
        btnOk.setRequestFocusEnabled(false);
        btnOk.setVerifyInputWhenFocusTarget(false);
        btnOk.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnOkMouseMoved(evt);
            }
        });
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnOkLayout = new javax.swing.GroupLayout(panBtnOk);
        panBtnOk.setLayout(panBtnOkLayout);
        panBtnOkLayout.setHorizontalGroup(
            panBtnOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnOkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnOkLayout.setVerticalGroup(
            panBtnOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnOkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblLogoCosmetica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCosmetica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/giant/Caelesti Management.png"))); // NOI18N

        javax.swing.GroupLayout panReadyOpLayout = new javax.swing.GroupLayout(panReadyOp);
        panReadyOp.setLayout(panReadyOpLayout);
        panReadyOpLayout.setHorizontalGroup(
            panReadyOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoCosmetica1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panReadyOpLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblReadyText, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(panReadyOpLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(panBtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panReadyOpLayout.setVerticalGroup(
            panReadyOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReadyOpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogoCosmetica1)
                .addGap(44, 44, 44)
                .addComponent(lblReadyText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(panBtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        panCard.add(panReadyOp, "card7");

        javax.swing.GroupLayout panWelcomeFormLayout = new javax.swing.GroupLayout(panWelcomeForm);
        panWelcomeForm.setLayout(panWelcomeFormLayout);
        panWelcomeFormLayout.setHorizontalGroup(
            panWelcomeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWelcomeFormLayout.createSequentialGroup()
                .addComponent(panLateralMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWelcomeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panButtonsTopBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addComponent(panCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panWelcomeFormLayout.setVerticalGroup(
            panWelcomeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWelcomeFormLayout.createSequentialGroup()
                .addComponent(panButtonsTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panLateralMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panWelcomeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panWelcomeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseMoved
        btnMin.setBackground(new java.awt.Color(239,232,244));
    }//GEN-LAST:event_btnMinMouseMoved

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setBackground(new java.awt.Color(255,245,249));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseMoved
        btnExit.setBackground(new java.awt.Color(255,183,183));
    }//GEN-LAST:event_btnExitMouseMoved

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new java.awt.Color(255,245,249));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnWelcomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWelcomeMouseExited
        panBtnWelcome.setBackground(new java.awt.Color(254,220,234));
        btnWelcome.setForeground(new java.awt.Color(0, 0, 0));
        btnWelcome.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnWelcomeMouseExited

    private void btnWelcomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWelcomeMouseMoved
        panBtnWelcome.setBackground(new java.awt.Color(194, 48, 111));
        btnWelcome.setForeground(new java.awt.Color(255,230,240));
        btnWelcome.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnWelcomeMouseMoved

    private void btnClearEnterpriseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearEnterpriseMouseMoved
        panBtnClearEnterprise.setBackground(new java.awt.Color(194, 48, 111));
        btnClearEnterprise.setForeground(new java.awt.Color(255,230,240));
        btnClearEnterprise.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnClearEnterpriseMouseMoved

    private void btnClearEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearEnterpriseMouseExited
        panBtnClearEnterprise.setBackground(new java.awt.Color(254,220,234));
        btnClearEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        btnClearEnterprise.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnClearEnterpriseMouseExited

    private void btnDataUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataUserMouseMoved
        panBtnDataUser.setBackground(new java.awt.Color(194, 48, 111));
        btnDataUser.setForeground(new java.awt.Color(255,230,240));
        btnDataUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnDataUserMouseMoved

    private void btnDataUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataUserMouseExited
        panBtnDataUser.setBackground(new java.awt.Color(254,220,234));
        btnDataUser.setForeground(new java.awt.Color(0, 0, 0));
        btnDataUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnDataUserMouseExited

    private void txtEnterprisePhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterprisePhoneKeyTyped
        support.integerPositiveKeyTyped(evt);
    }//GEN-LAST:event_txtEnterprisePhoneKeyTyped

    private void txtEnterpriseNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterpriseNameMouseClicked
        if(txtEnterpriseName.getText().equals("Orquídea. Cosmética Natural"))
            txtEnterpriseName.setText("");
    }//GEN-LAST:event_txtEnterpriseNameMouseClicked

    private void txtEnterpriseCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterpriseCodeMouseClicked
        if(txtEnterpriseCode.getText().equals("Ingresa el código de la empresa"))
            txtEnterpriseCode.setText("");
    }//GEN-LAST:event_txtEnterpriseCodeMouseClicked

    private void txtEnterpriseDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterpriseDescriptionMouseClicked
        if(txtEnterpriseDescription.getText().equals("Ingresa la descripción de la empresa"))
            txtEnterpriseDescription.setText("");
    }//GEN-LAST:event_txtEnterpriseDescriptionMouseClicked

    private void txtEnterpriseDirectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterpriseDirectionMouseClicked
        if(txtEnterpriseDirection.getText().equals("Ingresa la dirección de la empresa"))
            txtEnterpriseDirection.setText("");
    }//GEN-LAST:event_txtEnterpriseDirectionMouseClicked

    private void txtEnterprisePhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterprisePhoneMouseClicked
        if(txtEnterprisePhone.getText().equals("Ingresa el número telefónico de la empresa"))
            txtEnterprisePhone.setText("");
    }//GEN-LAST:event_txtEnterprisePhoneMouseClicked

    private void txtEnterpriseEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterpriseEmailMouseClicked
        if(txtEnterpriseEmail.getText().equals("Ingresa el correo electrónico de la empresa"))
            txtEnterpriseEmail.setText("");
    }//GEN-LAST:event_txtEnterpriseEmailMouseClicked

    private void txtUserDNIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserDNIMouseClicked
        if(txtUserDNI.getText().equals("Ingresa tu documento de identificación"))
            txtUserDNI.setText("");
    }//GEN-LAST:event_txtUserDNIMouseClicked

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        if(txtUserName.getText().equals("Ingresa tu nombre"))
            txtUserName.setText("");
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtUserSurnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserSurnameMouseClicked
        if(txtUserSurname.getText().equals("Ingresa tu apellido"))
            txtUserSurname.setText("");
    }//GEN-LAST:event_txtUserSurnameMouseClicked

    private void txtUserPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserPhoneMouseClicked
        if(txtUserPhone.getText().equals("Ingresa tu número telefónico"))
            txtUserPhone.setText("");
    }//GEN-LAST:event_txtUserPhoneMouseClicked

    private void txtUserDirectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserDirectionMouseClicked
        if(txtUserDirection.getText().equals("Ingresa tu dirección"))
            txtUserDirection.setText("");
    }//GEN-LAST:event_txtUserDirectionMouseClicked

    private void btnBackEnterpriseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackEnterpriseMouseMoved
        panBtnBackEnterprise.setBackground(new java.awt.Color(194, 48, 111));
        btnBackEnterprise.setForeground(new java.awt.Color(255,230,240));
        btnBackEnterprise.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnBackEnterpriseMouseMoved

    private void btnBackEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackEnterpriseMouseExited
        panBtnBackEnterprise.setBackground(new java.awt.Color(254,220,234));
        btnBackEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        btnBackEnterprise.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnBackEnterpriseMouseExited

    private void btnClearUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearUserMouseMoved
        panBtnClearUser.setBackground(new java.awt.Color(194, 48, 111));
        btnClearUser.setForeground(new java.awt.Color(255,230,240));
        btnClearUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnClearUserMouseMoved

    private void btnClearUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearUserMouseExited
        panBtnClearUser.setBackground(new java.awt.Color(254,220,234));
        btnClearUser.setForeground(new java.awt.Color(0, 0, 0));
        btnClearUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnClearUserMouseExited

    private void btnAccountUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountUserMouseMoved
        panBtnAccountUser.setBackground(new java.awt.Color(194, 48, 111));
        btnAccountUser.setForeground(new java.awt.Color(255,230,240));
        btnAccountUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnAccountUserMouseMoved

    private void btnAccountUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountUserMouseExited
        panBtnAccountUser.setBackground(new java.awt.Color(254,220,234));
        btnAccountUser.setForeground(new java.awt.Color(0, 0, 0));
        btnAccountUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnAccountUserMouseExited

    private void panWelcomeFormMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panWelcomeFormMousePressed
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método posee dos características:
         *      1) La opacidad de la aplicación disminuye un 20%.
         *      2) Se obtiene la ubicación del Mouse en el momento.
         */
        
        // Se coloca la opacidad de la aplicación en 80%.
        //</editor-fold>
        setOpacity((float)0.8);
        
        // Se obtiene la ubicación del Mouse en el momento.
        xx = evt.getX(); // Ubicación con respecto al eje X.
        xy = evt.getY(); // Ubicación con respecto al eje Y.
    }//GEN-LAST:event_panWelcomeFormMousePressed

    private void panWelcomeFormMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panWelcomeFormMouseReleased
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método devuelve la opacidad de la aplicación a su valor base.
         */
        
        // Se coloca la opacidad de la aplicación en 100%.
        //</editor-fold>
        setOpacity((float)1.0);
    }//GEN-LAST:event_panWelcomeFormMouseReleased

    private void panWelcomeFormMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panWelcomeFormMouseDragged
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método permite mover la aplicación por toda la pantalla del
         * computador del usuario.
         */
        
        // Se declaran las variables que obtienen la ubicación de la aplicación.
        //</editor-fold>
        int x = evt.getXOnScreen(); // Ubicación con respecto al eje X.
        int y = evt.getYOnScreen(); // Ubicación con respecto al eje Y.
        
        // Se ubica la aplicación en la nueva ubicación.
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panWelcomeFormMouseDragged

    private void txtUserPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPhoneKeyTyped
        support.integerPositiveKeyTyped(evt);
    }//GEN-LAST:event_txtUserPhoneKeyTyped

    private void txtUserEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserEmailMouseClicked
        if(txtUserEmail.getText().equals("Ingresa tu correo electrónico"))
            txtUserEmail.setText("");
    }//GEN-LAST:event_txtUserEmailMouseClicked

    private void txtUserConfirmEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserConfirmEmailMouseClicked
        if(txtUserConfirmEmail.getText().equals("Ingresa nuevamente tu correo electrónico"))
            txtUserConfirmEmail.setText("");
    }//GEN-LAST:event_txtUserConfirmEmailMouseClicked

    private void btnBackUserDataMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackUserDataMouseMoved
        panBtnBackUserData.setBackground(new java.awt.Color(194, 48, 111));
        btnBackUserData.setForeground(new java.awt.Color(255,230,240));
        btnBackUserData.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnBackUserDataMouseMoved

    private void btnBackUserDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackUserDataMouseExited
        panBtnBackUserData.setBackground(new java.awt.Color(254,220,234));
        btnBackUserData.setForeground(new java.awt.Color(0, 0, 0));
        btnBackUserData.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnBackUserDataMouseExited

    private void btnClearAccountUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearAccountUserMouseMoved
        panBtnClearAccountUser.setBackground(new java.awt.Color(194, 48, 111));
        btnClearAccountUser.setForeground(new java.awt.Color(255,230,240));
        btnClearAccountUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnClearAccountUserMouseMoved

    private void btnClearAccountUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearAccountUserMouseExited
        panBtnClearAccountUser.setBackground(new java.awt.Color(254,220,234));
        btnClearAccountUser.setForeground(new java.awt.Color(0, 0, 0));
        btnClearAccountUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnClearAccountUserMouseExited

    private void btnConfirmUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmUserMouseMoved
        panBtnConfirmUser.setBackground(new java.awt.Color(194, 48, 111));
        btnConfirmUser.setForeground(new java.awt.Color(255,230,240));
        btnConfirmUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnConfirmUserMouseMoved

    private void btnConfirmUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmUserMouseExited
        panBtnConfirmUser.setBackground(new java.awt.Color(254,220,234));
        btnConfirmUser.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnConfirmUserMouseExited

    private void btnSearchPhotoUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPhotoUserMouseMoved
        panBtnSearchPhotoUser.setBackground(new java.awt.Color(194, 48, 111));
        btnSearchPhotoUser.setForeground(new java.awt.Color(255,230,240));
        btnSearchPhotoUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnSearchPhotoUserMouseMoved

    private void btnSearchPhotoUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPhotoUserMouseExited
        panBtnSearchPhotoUser.setBackground(new java.awt.Color(254,220,234));
        btnSearchPhotoUser.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchPhotoUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnSearchPhotoUserMouseExited

    private void btnDeletePhotoUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePhotoUserMouseMoved
        panBtnDeletePhotoUser.setBackground(new java.awt.Color(194, 48, 111));
        btnDeletePhotoUser.setForeground(new java.awt.Color(255,230,240));
        btnDeletePhotoUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnDeletePhotoUserMouseMoved

    private void btnDeletePhotoUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePhotoUserMouseExited
        panBtnDeletePhotoUser.setBackground(new java.awt.Color(254,220,234));
        btnDeletePhotoUser.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletePhotoUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnDeletePhotoUserMouseExited

    private void txtEmailConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailConfirmMouseClicked
        if(txtEmailConfirm.getText().equals("Ingresa tu correo electrónico"))
            txtEmailConfirm.setText("");
    }//GEN-LAST:event_txtEmailConfirmMouseClicked

    private void txtCodeConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodeConfirmMouseClicked
        if(txtCodeConfirm.getText().equals("Ingresa el código de verificación"))
            txtCodeConfirm.setText("");
    }//GEN-LAST:event_txtCodeConfirmMouseClicked

    private void btnBackUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackUserMouseMoved
        panBtnBackUser.setBackground(new java.awt.Color(194, 48, 111));
        btnBackUser.setForeground(new java.awt.Color(255,230,240));
        btnBackUser.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnBackUserMouseMoved

    private void btnBackUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackUserMouseExited
        panBtnBackUser.setBackground(new java.awt.Color(254,220,234));
        btnBackUser.setForeground(new java.awt.Color(0, 0, 0));
        btnBackUser.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnBackUserMouseExited

    private void btnClearConfirmMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearConfirmMouseMoved
        panBtnClearConfirm.setBackground(new java.awt.Color(194, 48, 111));
        btnClearConfirm.setForeground(new java.awt.Color(255,230,240));
        btnClearConfirm.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnClearConfirmMouseMoved

    private void btnClearConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearConfirmMouseExited
        panBtnClearConfirm.setBackground(new java.awt.Color(254,220,234));
        btnClearConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnClearConfirm.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnClearConfirmMouseExited

    private void btnReadyMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadyMouseMoved
        panBtnReady.setBackground(new java.awt.Color(194, 48, 111));
        btnReady.setForeground(new java.awt.Color(255,230,240));
        btnReady.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnReadyMouseMoved

    private void btnReadyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadyMouseExited
        panBtnReady.setBackground(new java.awt.Color(254,220,234));
        btnReady.setForeground(new java.awt.Color(0, 0, 0));
        btnReady.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnReadyMouseExited

    private void pssUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pssUserMouseClicked
        if(String.valueOf(pssUser.getPassword()).equals("Ingresa tu contraseña"))
            pssUser.setText("");
    }//GEN-LAST:event_pssUserMouseClicked

    private void pssUserConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pssUserConfirmMouseClicked
        if(String.valueOf(pssUserConfirm.getPassword()).equals("Ingresa tu contraseña"))
            pssUserConfirm.setText("");
    }//GEN-LAST:event_pssUserConfirmMouseClicked

    private void btnOkMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseMoved
        panBtnOk.setBackground(new java.awt.Color(194, 48, 111));
        btnOk.setForeground(new java.awt.Color(255,230,240));
        btnOk.setBackground(new java.awt.Color(194, 48, 111));
    }//GEN-LAST:event_btnOkMouseMoved

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        panBtnOk.setBackground(new java.awt.Color(254,220,234));
        btnOk.setForeground(new java.awt.Color(0, 0, 0));
        btnOk.setBackground(new java.awt.Color(254,220,234));
    }//GEN-LAST:event_btnOkMouseExited

    private void panLateralMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLateralMenuMouseDragged
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
        * Este método permite mover la aplicación por toda la pantalla del
        * computador del usuario.
        */

        // Se declaran las variables que obtienen la ubicación de la aplicación.
        //</editor-fold>
        int x = evt.getXOnScreen(); // Ubicación con respecto al eje X.
        int y = evt.getYOnScreen(); // Ubicación con respecto al eje Y.

        // Se ubica la aplicación en la nueva ubicación.
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panLateralMenuMouseDragged

    private void panLateralMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLateralMenuMousePressed
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
        * Este método posee dos características:
        *      1) La opacidad de la aplicación disminuye un 20%.
        *      2) Se obtiene la ubicación del Mouse en el momento.
        */

        // Se coloca la opacidad de la aplicación en 80%.
        //</editor-fold>
        setOpacity((float)0.8);

        // Se obtiene la ubicación del Mouse en el momento.
        xx = evt.getX(); // Ubicación con respecto al eje X.
        xy = evt.getY(); // Ubicación con respecto al eje Y.
    }//GEN-LAST:event_panLateralMenuMousePressed

    private void panLateralMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panLateralMenuMouseReleased
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
        * Este método devuelve la opacidad de la aplicación a su valor base.
        */

        // Se coloca la opacidad de la aplicación en 100%.
        //</editor-fold>
        setOpacity((float)1.0);
    }//GEN-LAST:event_panLateralMenuMouseReleased

    //<editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAccountUser;
    public javax.swing.JButton btnBackEnterprise;
    public javax.swing.JButton btnBackUser;
    public javax.swing.JButton btnBackUserData;
    public javax.swing.JButton btnClearAccountUser;
    public javax.swing.JButton btnClearConfirm;
    public javax.swing.JButton btnClearEnterprise;
    public javax.swing.JButton btnClearUser;
    public javax.swing.JButton btnConfirmUser;
    public javax.swing.JButton btnDataUser;
    public javax.swing.JButton btnDeletePhotoUser;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnMin;
    public javax.swing.JButton btnOk;
    public javax.swing.JButton btnReady;
    public javax.swing.JButton btnSearchPhotoUser;
    public javax.swing.JButton btnWelcome;
    public com.toedter.calendar.JDateChooser dtcUserBirthday;
    public javax.swing.JLabel lblCaelestiDevelopment;
    private javax.swing.JLabel lblCodeConfirm;
    public javax.swing.JLabel lblData;
    public javax.swing.JLabel lblDataConfirm;
    public javax.swing.JLabel lblDataConfirmIcon;
    public javax.swing.JLabel lblDataIcon;
    public javax.swing.JLabel lblDataUser;
    public javax.swing.JLabel lblDataUserIcon;
    private javax.swing.JLabel lblEmailConfirm;
    public javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterpriseCode;
    private javax.swing.JLabel lblEnterpriseDescription;
    private javax.swing.JLabel lblEnterpriseDirection;
    private javax.swing.JLabel lblEnterpriseEmail;
    public javax.swing.JLabel lblEnterpriseIcon;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterprisePhone;
    public javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblLogoCosmetica;
    public javax.swing.JLabel lblLogoCosmetica1;
    public javax.swing.JLabel lblPhoto;
    public javax.swing.JLabel lblReady;
    public javax.swing.JLabel lblReadyIcon;
    public javax.swing.JLabel lblReadyText;
    private javax.swing.JLabel lblTextConfirm;
    private javax.swing.JLabel lblUserBirthday;
    private javax.swing.JLabel lblUserConfirmEmail;
    private javax.swing.JLabel lblUserDNI;
    private javax.swing.JLabel lblUserDirection;
    private javax.swing.JLabel lblUserEmail;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JLabel lblUserPassword1;
    private javax.swing.JLabel lblUserPhone;
    private javax.swing.JLabel lblUserPhoto;
    private javax.swing.JLabel lblUserSurname;
    public javax.swing.JLabel lblWelcomIcon;
    public javax.swing.JLabel lblWelcome;
    public javax.swing.JLabel lblWelcomeText;
    public javax.swing.JPanel panBtnAccountUser;
    public javax.swing.JPanel panBtnBackEnterprise;
    public javax.swing.JPanel panBtnBackUser;
    public javax.swing.JPanel panBtnBackUserData;
    public javax.swing.JPanel panBtnClearAccountUser;
    public javax.swing.JPanel panBtnClearConfirm;
    public javax.swing.JPanel panBtnClearEnterprise;
    public javax.swing.JPanel panBtnClearUser;
    public javax.swing.JPanel panBtnConfirmUser;
    public javax.swing.JPanel panBtnDataUser;
    public javax.swing.JPanel panBtnDeletePhotoUser;
    public javax.swing.JPanel panBtnOk;
    public javax.swing.JPanel panBtnReady;
    public javax.swing.JPanel panBtnSearchPhotoUser;
    public javax.swing.JPanel panBtnWelcome;
    public javax.swing.JPanel panButtonsTopBar;
    public javax.swing.JPanel panCard;
    public javax.swing.JPanel panConfirmOp;
    public javax.swing.JPanel panData;
    public javax.swing.JPanel panDataConfirm;
    public javax.swing.JPanel panDataOp;
    public javax.swing.JPanel panDataUser;
    public javax.swing.JPanel panDataUserOp;
    public javax.swing.JPanel panEnterpriseInfo;
    public javax.swing.JPanel panEnterpriseOp;
    private javax.swing.JPanel panLateralMenu;
    public javax.swing.JPanel panReady;
    public javax.swing.JPanel panReadyOp;
    public javax.swing.JPanel panWelcome;
    public javax.swing.JPanel panWelcomeForm;
    public javax.swing.JPanel panWelcomeOp;
    public javax.swing.JPasswordField pssUser;
    public javax.swing.JPasswordField pssUserConfirm;
    public javax.swing.JToggleButton tgbShowPass;
    public javax.swing.JToggleButton tgbShowPass1;
    public javax.swing.JTextField txtCodeConfirm;
    public javax.swing.JTextField txtEmailConfirm;
    public javax.swing.JTextField txtEnterpriseCode;
    public javax.swing.JTextField txtEnterpriseDescription;
    public javax.swing.JTextField txtEnterpriseDirection;
    public javax.swing.JTextField txtEnterpriseEmail;
    public javax.swing.JTextField txtEnterpriseName;
    public javax.swing.JTextField txtEnterprisePhone;
    public javax.swing.JTextField txtPhotoPath;
    public javax.swing.JTextField txtUserConfirmEmail;
    public javax.swing.JTextField txtUserDNI;
    public javax.swing.JTextField txtUserDirection;
    public javax.swing.JTextField txtUserEmail;
    public javax.swing.JTextField txtUserName;
    public javax.swing.JTextField txtUserPhone;
    public javax.swing.JTextField txtUserSurname;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
