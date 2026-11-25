# Java 19 – JSF Proje Takip ve Jersey REST Örnekleri

JSF + PrimeFaces + Hibernate ile yazılmış basit bir proje takip uygulaması ve Jersey ile yazılmış küçük bir REST servisi. Java eğitimindeki derslerde örnek olarak hazırlandı.

> **Not:** Bu depo 2017 yılında eğitim/örnek amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `ProjeTakipUygulamasi` | JSF/PrimeFaces web uygulaması. Kullanıcı girişi (`LoginBean`, `/guvenli/*` altını koruyan `LoginFilter`), kullanıcı ekleme/listeleme, proje ekleme ve durumlarıyla listeleme. Liste sayfasında Excel'e aktarma (Apache POI) vardır. Veritabanı erişimi Hibernate ile `DAO` sınıfında. |
| `Kullanicilar` | Jersey 1.x REST servisi. `/rest/merhaba/selamcak` düz metin döner, `/rest/merhaba/selamcak/{a}/{b}` iki sayıyı toplar, `/rest/merhaba/person` Gson ile JSON kişi listesi döner. |

## Teknolojiler

- Java 8, Maven (`war` paketleme)
- JSF 2.1.7 (Mojarra), PrimeFaces 6.1, Hibernate 5.1, MySQL Connector 5.1, Apache POI 3.7
- Jersey 1.8, Gson 2.8
- Servlet konteyneri olarak Tomcat

## Çalıştırma

1. Projeleri Eclipse'e "Existing Maven Projects" olarak alın ve bir Tomcat sunucusuna ekleyin (ya da `mvn package` ile `war` üretip Tomcat'e kopyalayın).
2. `ProjeTakipUygulamasi` için MySQL'de `proje_takip` adlı bir veritabanı oluşturun. Bağlantı ayarları `ProjeTakipUygulamasi/resource/hibernate.cfg.xml` içindedir; şifre alanında `SIFRE_KALDIRILDI` yazar, kendi kullanıcı adı ve şifrenizi girin. Tablolar `hbm2ddl.auto=update` ile otomatik oluşur.
3. Uygulama açılışta `index.xhtml` giriş sayfasını gösterir; giriş için veritabanındaki kullanıcı tablosunda bir kayıt bulunmalıdır.
