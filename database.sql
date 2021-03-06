PGDMP     :                
    x            Orquidea    12.3    12.3 R    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    57364    Orquidea    DATABASE     �   CREATE DATABASE "Orquidea" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Bolivarian Republic of Venezuela.1252' LC_CTYPE = 'Spanish_Bolivarian Republic of Venezuela.1252';
    DROP DATABASE "Orquidea";
                postgres    false            �            1259    65603    AssociatedAccount    TABLE     u   CREATE TABLE public."AssociatedAccount" (
    "EnterpriseAccountBankid" integer,
    "EnterpriseWalletid" integer
);
 '   DROP TABLE public."AssociatedAccount";
       public         heap    postgres    false            �            1259    65626    Balance    TABLE     �   CREATE TABLE public."Balance" (
    id integer NOT NULL,
    "EnterpriseWalletid" integer,
    name character varying,
    type "char",
    percentage double precision,
    amount double precision,
    state "char"
);
    DROP TABLE public."Balance";
       public         heap    postgres    false            �            1259    65744    Client    TABLE       CREATE TABLE public."Client" (
    id integer NOT NULL,
    dni character varying,
    name character varying,
    surname character varying,
    direction character varying,
    phone numeric,
    email character varying,
    birthday date,
    state "char"
);
    DROP TABLE public."Client";
       public         heap    postgres    false            �            1259    65639    Employee    TABLE     7  CREATE TABLE public."Employee" (
    id integer NOT NULL,
    "Enterpriseid" integer,
    name character varying,
    surname character varying,
    "admissionDate" date,
    birthday date,
    direction character varying,
    phone numeric,
    state "char",
    dni character varying,
    "Userid" integer
);
    DROP TABLE public."Employee";
       public         heap    postgres    false            �            1259    65556 
   Enterprise    TABLE     �   CREATE TABLE public."Enterprise" (
    id integer NOT NULL,
    dni character varying,
    name character varying,
    description character varying,
    direction character varying,
    phone numeric,
    email character varying,
    state "char"
);
     DROP TABLE public."Enterprise";
       public         heap    postgres    false            �            1259    65590    EnterpriseWallet    TABLE     �   CREATE TABLE public."EnterpriseWallet" (
    id integer NOT NULL,
    "Enterpriseid" integer,
    name character varying,
    description character varying,
    amount double precision,
    state "char"
);
 &   DROP TABLE public."EnterpriseWallet";
       public         heap    postgres    false            �            1259    65577    EnterprseAccountBank    TABLE     +  CREATE TABLE public."EnterprseAccountBank" (
    id integer NOT NULL,
    "Enterpriseid" integer,
    dni character varying,
    name character varying,
    bank character varying,
    account numeric,
    amount double precision,
    phone numeric,
    email character varying,
    state "char"
);
 *   DROP TABLE public."EnterprseAccountBank";
       public         heap    postgres    false            �            1259    65564    FixedExpense    TABLE     �   CREATE TABLE public."FixedExpense" (
    id integer NOT NULL,
    "Enterpriseid" integer,
    name character varying,
    description character varying,
    date date,
    cost double precision,
    state "char"
);
 "   DROP TABLE public."FixedExpense";
       public         heap    postgres    false            �            1259    65665    Notification    TABLE     �   CREATE TABLE public."Notification" (
    id integer NOT NULL,
    name character varying,
    message character varying,
    "showUp" "char",
    state "char",
    type integer
);
 "   DROP TABLE public."Notification";
       public         heap    postgres    false            �            1259    65673    NotificationToUser    TABLE     �   CREATE TABLE public."NotificationToUser" (
    "Notificationid" integer,
    "receivesDate" date,
    "Userid" integer,
    viewed "char"
);
 (   DROP TABLE public."NotificationToUser";
       public         heap    postgres    false            �            1259    65771    Product    TABLE     =  CREATE TABLE public."Product" (
    id integer NOT NULL,
    name character varying,
    description character varying,
    type "char",
    "stockMinimun" double precision,
    "stockMaximun" double precision,
    quantity double precision,
    cost double precision,
    price double precision,
    state "char"
);
    DROP TABLE public."Product";
       public         heap    postgres    false            �            1259    65731 
   ProvidedBy    TABLE     W   CREATE TABLE public."ProvidedBy" (
    "Providerid" integer,
    "Supplyid" integer
);
     DROP TABLE public."ProvidedBy";
       public         heap    postgres    false            �            1259    65723    Provider    TABLE     �   CREATE TABLE public."Provider" (
    id integer NOT NULL,
    name character varying,
    description character varying,
    direction character varying,
    phone numeric,
    email character varying,
    state "char"
);
    DROP TABLE public."Provider";
       public         heap    postgres    false            �            1259    65689    Purchase    TABLE     �   CREATE TABLE public."Purchase" (
    id integer NOT NULL,
    "Employeeid" integer,
    "accountBank" numeric,
    date date,
    "subTotal" double precision,
    iva double precision,
    total double precision,
    state "char"
);
    DROP TABLE public."Purchase";
       public         heap    postgres    false            �            1259    65710    PurchaseDetail    TABLE     z   CREATE TABLE public."PurchaseDetail" (
    "Purchaseid" integer,
    "Supplyid" integer,
    quantity double precision
);
 $   DROP TABLE public."PurchaseDetail";
       public         heap    postgres    false            �            1259    65792    RequerimentElaboration    TABLE     �   CREATE TABLE public."RequerimentElaboration" (
    "Supplyid" integer,
    "Productid" integer,
    quantity double precision
);
 ,   DROP TABLE public."RequerimentElaboration";
       public         heap    postgres    false            �            1259    65753    Sale    TABLE     P  CREATE TABLE public."Sale" (
    id integer NOT NULL,
    "Employeeid" integer,
    "Clientid" integer,
    "accountBank" numeric,
    "datePay" date,
    "deliveryDate" date,
    "payForm" "char",
    discount double precision,
    "subTotal" double precision,
    iva double precision,
    total double precision,
    state "char"
);
    DROP TABLE public."Sale";
       public         heap    postgres    false            �            1259    65779 
   SaleDetail    TABLE     s   CREATE TABLE public."SaleDetail" (
    "Saleid" integer,
    "Productid" integer,
    quantity double precision
);
     DROP TABLE public."SaleDetail";
       public         heap    postgres    false            �            1259    65702    Supply    TABLE       CREATE TABLE public."Supply" (
    id integer NOT NULL,
    name character varying,
    description character varying,
    "stockMinimun" double precision,
    "stockMaximun" double precision,
    quantity double precision,
    cost double precision,
    state "char"
);
    DROP TABLE public."Supply";
       public         heap    postgres    false            �            1259    65652    User    TABLE       CREATE TABLE public."User" (
    id integer NOT NULL,
    email character varying NOT NULL,
    "UserTypeid" integer,
    password character varying,
    "rememberData" "char",
    "firstSession" date,
    "lastSession" date,
    photo bytea,
    state "char"
);
    DROP TABLE public."User";
       public         heap    postgres    false            �            1259    65616    WalletSettings    TABLE     �   CREATE TABLE public."WalletSettings" (
    "EnterpriseWalletid" integer NOT NULL,
    "fixedExpensesAmount" "char",
    "incomesAmount" "char",
    "purchasesAmount" "char"
);
 $   DROP TABLE public."WalletSettings";
       public         heap    postgres    false            �          0    65603    AssociatedAccount 
   TABLE DATA           ^   COPY public."AssociatedAccount" ("EnterpriseAccountBankid", "EnterpriseWalletid") FROM stdin;
    public          postgres    false    206   �i       �          0    65626    Balance 
   TABLE DATA           d   COPY public."Balance" (id, "EnterpriseWalletid", name, type, percentage, amount, state) FROM stdin;
    public          postgres    false    208   j       �          0    65744    Client 
   TABLE DATA           d   COPY public."Client" (id, dni, name, surname, direction, phone, email, birthday, state) FROM stdin;
    public          postgres    false    218   j       �          0    65639    Employee 
   TABLE DATA           �   COPY public."Employee" (id, "Enterpriseid", name, surname, "admissionDate", birthday, direction, phone, state, dni, "Userid") FROM stdin;
    public          postgres    false    209   <j       �          0    65556 
   Enterprise 
   TABLE DATA           b   COPY public."Enterprise" (id, dni, name, description, direction, phone, email, state) FROM stdin;
    public          postgres    false    202   Yj       �          0    65590    EnterpriseWallet 
   TABLE DATA           b   COPY public."EnterpriseWallet" (id, "Enterpriseid", name, description, amount, state) FROM stdin;
    public          postgres    false    205   vj       �          0    65577    EnterprseAccountBank 
   TABLE DATA           {   COPY public."EnterprseAccountBank" (id, "Enterpriseid", dni, name, bank, account, amount, phone, email, state) FROM stdin;
    public          postgres    false    204   �j       �          0    65564    FixedExpense 
   TABLE DATA           b   COPY public."FixedExpense" (id, "Enterpriseid", name, description, date, cost, state) FROM stdin;
    public          postgres    false    203   �j       �          0    65665    Notification 
   TABLE DATA           R   COPY public."Notification" (id, name, message, "showUp", state, type) FROM stdin;
    public          postgres    false    211   �j       �          0    65673    NotificationToUser 
   TABLE DATA           b   COPY public."NotificationToUser" ("Notificationid", "receivesDate", "Userid", viewed) FROM stdin;
    public          postgres    false    212   �j       �          0    65771    Product 
   TABLE DATA           ~   COPY public."Product" (id, name, description, type, "stockMinimun", "stockMaximun", quantity, cost, price, state) FROM stdin;
    public          postgres    false    220   k       �          0    65731 
   ProvidedBy 
   TABLE DATA           @   COPY public."ProvidedBy" ("Providerid", "Supplyid") FROM stdin;
    public          postgres    false    217   $k       �          0    65723    Provider 
   TABLE DATA           [   COPY public."Provider" (id, name, description, direction, phone, email, state) FROM stdin;
    public          postgres    false    216   Ak       �          0    65689    Purchase 
   TABLE DATA           j   COPY public."Purchase" (id, "Employeeid", "accountBank", date, "subTotal", iva, total, state) FROM stdin;
    public          postgres    false    213   ^k       �          0    65710    PurchaseDetail 
   TABLE DATA           N   COPY public."PurchaseDetail" ("Purchaseid", "Supplyid", quantity) FROM stdin;
    public          postgres    false    215   {k       �          0    65792    RequerimentElaboration 
   TABLE DATA           U   COPY public."RequerimentElaboration" ("Supplyid", "Productid", quantity) FROM stdin;
    public          postgres    false    222   �k       �          0    65753    Sale 
   TABLE DATA           �   COPY public."Sale" (id, "Employeeid", "Clientid", "accountBank", "datePay", "deliveryDate", "payForm", discount, "subTotal", iva, total, state) FROM stdin;
    public          postgres    false    219   �k       �          0    65779 
   SaleDetail 
   TABLE DATA           G   COPY public."SaleDetail" ("Saleid", "Productid", quantity) FROM stdin;
    public          postgres    false    221   �k       �          0    65702    Supply 
   TABLE DATA           p   COPY public."Supply" (id, name, description, "stockMinimun", "stockMaximun", quantity, cost, state) FROM stdin;
    public          postgres    false    214   �k       �          0    65652    User 
   TABLE DATA           �   COPY public."User" (id, email, "UserTypeid", password, "rememberData", "firstSession", "lastSession", photo, state) FROM stdin;
    public          postgres    false    210   l       �          0    65616    WalletSettings 
   TABLE DATA           {   COPY public."WalletSettings" ("EnterpriseWalletid", "fixedExpensesAmount", "incomesAmount", "purchasesAmount") FROM stdin;
    public          postgres    false    207   )l       �
           2606    65633    Balance Balance_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public."Balance"
    ADD CONSTRAINT "Balance_pkey" PRIMARY KEY (id);
 B   ALTER TABLE ONLY public."Balance" DROP CONSTRAINT "Balance_pkey";
       public            postgres    false    208            �
           2606    65751    Client Client_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Client"
    ADD CONSTRAINT "Client_pkey" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public."Client" DROP CONSTRAINT "Client_pkey";
       public            postgres    false    218            �
           2606    65646    Employee Employee_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Employee"
    ADD CONSTRAINT "Employee_pkey" PRIMARY KEY (id);
 D   ALTER TABLE ONLY public."Employee" DROP CONSTRAINT "Employee_pkey";
       public            postgres    false    209            �
           2606    65597 &   EnterpriseWallet EnterpriseWallet_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public."EnterpriseWallet"
    ADD CONSTRAINT "EnterpriseWallet_pkey" PRIMARY KEY (id);
 T   ALTER TABLE ONLY public."EnterpriseWallet" DROP CONSTRAINT "EnterpriseWallet_pkey";
       public            postgres    false    205            �
           2606    65563    Enterprise Enterprise_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."Enterprise"
    ADD CONSTRAINT "Enterprise_pkey" PRIMARY KEY (id);
 H   ALTER TABLE ONLY public."Enterprise" DROP CONSTRAINT "Enterprise_pkey";
       public            postgres    false    202            �
           2606    65584 .   EnterprseAccountBank EnterprseAccountBank_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public."EnterprseAccountBank"
    ADD CONSTRAINT "EnterprseAccountBank_pkey" PRIMARY KEY (id);
 \   ALTER TABLE ONLY public."EnterprseAccountBank" DROP CONSTRAINT "EnterprseAccountBank_pkey";
       public            postgres    false    204            �
           2606    65571    FixedExpense FixedExpense_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."FixedExpense"
    ADD CONSTRAINT "FixedExpense_pkey" PRIMARY KEY (id);
 L   ALTER TABLE ONLY public."FixedExpense" DROP CONSTRAINT "FixedExpense_pkey";
       public            postgres    false    203            �
           2606    65672    Notification Notification_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."Notification"
    ADD CONSTRAINT "Notification_pkey" PRIMARY KEY (id);
 L   ALTER TABLE ONLY public."Notification" DROP CONSTRAINT "Notification_pkey";
       public            postgres    false    211            �
           2606    65778    Product Product_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public."Product"
    ADD CONSTRAINT "Product_pkey" PRIMARY KEY (id);
 B   ALTER TABLE ONLY public."Product" DROP CONSTRAINT "Product_pkey";
       public            postgres    false    220            �
           2606    65730    Provider Provider_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Provider"
    ADD CONSTRAINT "Provider_pkey" PRIMARY KEY (id);
 D   ALTER TABLE ONLY public."Provider" DROP CONSTRAINT "Provider_pkey";
       public            postgres    false    216            �
           2606    65696    Purchase Purchase_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Purchase"
    ADD CONSTRAINT "Purchase_pkey" PRIMARY KEY (id);
 D   ALTER TABLE ONLY public."Purchase" DROP CONSTRAINT "Purchase_pkey";
       public            postgres    false    213            �
           2606    65760    Sale Sale_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public."Sale"
    ADD CONSTRAINT "Sale_pkey" PRIMARY KEY (id);
 <   ALTER TABLE ONLY public."Sale" DROP CONSTRAINT "Sale_pkey";
       public            postgres    false    219            �
           2606    65709    Supply Supply_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Supply"
    ADD CONSTRAINT "Supply_pkey" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public."Supply" DROP CONSTRAINT "Supply_pkey";
       public            postgres    false    214            �
           2606    106523    User Userid 
   CONSTRAINT     M   ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "Userid" PRIMARY KEY (id);
 9   ALTER TABLE ONLY public."User" DROP CONSTRAINT "Userid";
       public            postgres    false    210            �
           2606    65620 "   WalletSettings WalletSettings_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public."WalletSettings"
    ADD CONSTRAINT "WalletSettings_pkey" PRIMARY KEY ("EnterpriseWalletid");
 P   ALTER TABLE ONLY public."WalletSettings" DROP CONSTRAINT "WalletSettings_pkey";
       public            postgres    false    207            
           2606    65766    Sale Clientid    FK CONSTRAINT     v   ALTER TABLE ONLY public."Sale"
    ADD CONSTRAINT "Clientid" FOREIGN KEY ("Clientid") REFERENCES public."Client"(id);
 ;   ALTER TABLE ONLY public."Sale" DROP CONSTRAINT "Clientid";
       public          postgres    false    219    218    2805                       2606    65697    Purchase Employeeid    FK CONSTRAINT     �   ALTER TABLE ONLY public."Purchase"
    ADD CONSTRAINT "Employeeid" FOREIGN KEY ("Employeeid") REFERENCES public."Employee"(id);
 A   ALTER TABLE ONLY public."Purchase" DROP CONSTRAINT "Employeeid";
       public          postgres    false    209    2793    213            	           2606    65761    Sale Employeeid    FK CONSTRAINT     |   ALTER TABLE ONLY public."Sale"
    ADD CONSTRAINT "Employeeid" FOREIGN KEY ("Employeeid") REFERENCES public."Employee"(id);
 =   ALTER TABLE ONLY public."Sale" DROP CONSTRAINT "Employeeid";
       public          postgres    false    2793    209    219            �
           2606    65606 %   AssociatedAccount EnterpriseAccountid    FK CONSTRAINT     �   ALTER TABLE ONLY public."AssociatedAccount"
    ADD CONSTRAINT "EnterpriseAccountid" FOREIGN KEY ("EnterpriseAccountBankid") REFERENCES public."EnterprseAccountBank"(id);
 S   ALTER TABLE ONLY public."AssociatedAccount" DROP CONSTRAINT "EnterpriseAccountid";
       public          postgres    false    204    206    2785            �
           2606    65611 $   AssociatedAccount EnterpriseWalletid    FK CONSTRAINT     �   ALTER TABLE ONLY public."AssociatedAccount"
    ADD CONSTRAINT "EnterpriseWalletid" FOREIGN KEY ("EnterpriseWalletid") REFERENCES public."EnterpriseWallet"(id);
 R   ALTER TABLE ONLY public."AssociatedAccount" DROP CONSTRAINT "EnterpriseWalletid";
       public          postgres    false    206    205    2787            �
           2606    65621 !   WalletSettings EnterpriseWalletid    FK CONSTRAINT     �   ALTER TABLE ONLY public."WalletSettings"
    ADD CONSTRAINT "EnterpriseWalletid" FOREIGN KEY ("EnterpriseWalletid") REFERENCES public."EnterpriseWallet"(id);
 O   ALTER TABLE ONLY public."WalletSettings" DROP CONSTRAINT "EnterpriseWalletid";
       public          postgres    false    207    2787    205                        2606    65634    Balance EnterpriseWalletid    FK CONSTRAINT     �   ALTER TABLE ONLY public."Balance"
    ADD CONSTRAINT "EnterpriseWalletid" FOREIGN KEY ("EnterpriseWalletid") REFERENCES public."EnterpriseWallet"(id);
 H   ALTER TABLE ONLY public."Balance" DROP CONSTRAINT "EnterpriseWalletid";
       public          postgres    false    208    2787    205            �
           2606    65572    FixedExpense Enterpriseid    FK CONSTRAINT     �   ALTER TABLE ONLY public."FixedExpense"
    ADD CONSTRAINT "Enterpriseid" FOREIGN KEY ("Enterpriseid") REFERENCES public."Enterprise"(id);
 G   ALTER TABLE ONLY public."FixedExpense" DROP CONSTRAINT "Enterpriseid";
       public          postgres    false    2781    203    202            �
           2606    65585 !   EnterprseAccountBank Enterpriseid    FK CONSTRAINT     �   ALTER TABLE ONLY public."EnterprseAccountBank"
    ADD CONSTRAINT "Enterpriseid" FOREIGN KEY ("Enterpriseid") REFERENCES public."Enterprise"(id);
 O   ALTER TABLE ONLY public."EnterprseAccountBank" DROP CONSTRAINT "Enterpriseid";
       public          postgres    false    202    204    2781            �
           2606    65598    EnterpriseWallet Enterpriseid    FK CONSTRAINT     �   ALTER TABLE ONLY public."EnterpriseWallet"
    ADD CONSTRAINT "Enterpriseid" FOREIGN KEY ("Enterpriseid") REFERENCES public."Enterprise"(id);
 K   ALTER TABLE ONLY public."EnterpriseWallet" DROP CONSTRAINT "Enterpriseid";
       public          postgres    false    202    205    2781                       2606    65647    Employee Enterpriseid    FK CONSTRAINT     �   ALTER TABLE ONLY public."Employee"
    ADD CONSTRAINT "Enterpriseid" FOREIGN KEY ("Enterpriseid") REFERENCES public."Enterprise"(id);
 C   ALTER TABLE ONLY public."Employee" DROP CONSTRAINT "Enterpriseid";
       public          postgres    false    209    2781    202                       2606    65684 !   NotificationToUser Notificationid    FK CONSTRAINT     �   ALTER TABLE ONLY public."NotificationToUser"
    ADD CONSTRAINT "Notificationid" FOREIGN KEY ("Notificationid") REFERENCES public."Notification"(id);
 O   ALTER TABLE ONLY public."NotificationToUser" DROP CONSTRAINT "Notificationid";
       public          postgres    false    2797    212    211                       2606    65787    SaleDetail Productid    FK CONSTRAINT        ALTER TABLE ONLY public."SaleDetail"
    ADD CONSTRAINT "Productid" FOREIGN KEY ("Productid") REFERENCES public."Product"(id);
 B   ALTER TABLE ONLY public."SaleDetail" DROP CONSTRAINT "Productid";
       public          postgres    false    220    221    2809                       2606    65800     RequerimentElaboration Productid    FK CONSTRAINT     �   ALTER TABLE ONLY public."RequerimentElaboration"
    ADD CONSTRAINT "Productid" FOREIGN KEY ("Productid") REFERENCES public."Product"(id);
 N   ALTER TABLE ONLY public."RequerimentElaboration" DROP CONSTRAINT "Productid";
       public          postgres    false    2809    222    220                       2606    65734    ProvidedBy Providerid    FK CONSTRAINT     �   ALTER TABLE ONLY public."ProvidedBy"
    ADD CONSTRAINT "Providerid" FOREIGN KEY ("Providerid") REFERENCES public."Provider"(id);
 C   ALTER TABLE ONLY public."ProvidedBy" DROP CONSTRAINT "Providerid";
       public          postgres    false    2803    216    217                       2606    65713    PurchaseDetail Purchaseid    FK CONSTRAINT     �   ALTER TABLE ONLY public."PurchaseDetail"
    ADD CONSTRAINT "Purchaseid" FOREIGN KEY ("Purchaseid") REFERENCES public."Purchase"(id);
 G   ALTER TABLE ONLY public."PurchaseDetail" DROP CONSTRAINT "Purchaseid";
       public          postgres    false    213    2799    215                       2606    65782    SaleDetail Saleid    FK CONSTRAINT     v   ALTER TABLE ONLY public."SaleDetail"
    ADD CONSTRAINT "Saleid" FOREIGN KEY ("Saleid") REFERENCES public."Sale"(id);
 ?   ALTER TABLE ONLY public."SaleDetail" DROP CONSTRAINT "Saleid";
       public          postgres    false    2807    219    221                       2606    65718    PurchaseDetail Supplyid    FK CONSTRAINT     �   ALTER TABLE ONLY public."PurchaseDetail"
    ADD CONSTRAINT "Supplyid" FOREIGN KEY ("Supplyid") REFERENCES public."Supply"(id);
 E   ALTER TABLE ONLY public."PurchaseDetail" DROP CONSTRAINT "Supplyid";
       public          postgres    false    215    214    2801                       2606    65739    ProvidedBy Supplyid    FK CONSTRAINT     |   ALTER TABLE ONLY public."ProvidedBy"
    ADD CONSTRAINT "Supplyid" FOREIGN KEY ("Supplyid") REFERENCES public."Supply"(id);
 A   ALTER TABLE ONLY public."ProvidedBy" DROP CONSTRAINT "Supplyid";
       public          postgres    false    2801    214    217                       2606    65795    RequerimentElaboration Supplyid    FK CONSTRAINT     �   ALTER TABLE ONLY public."RequerimentElaboration"
    ADD CONSTRAINT "Supplyid" FOREIGN KEY ("Supplyid") REFERENCES public."Supply"(id);
 M   ALTER TABLE ONLY public."RequerimentElaboration" DROP CONSTRAINT "Supplyid";
       public          postgres    false    2801    222    214                       2606    106524    Employee Userid    FK CONSTRAINT     ~   ALTER TABLE ONLY public."Employee"
    ADD CONSTRAINT "Userid" FOREIGN KEY ("Userid") REFERENCES public."User"(id) NOT VALID;
 =   ALTER TABLE ONLY public."Employee" DROP CONSTRAINT "Userid";
       public          postgres    false    2795    209    210            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     