package com.example.beautyofbondowoso

object DestinationData {

    private val destinationName = arrayOf(
        "Kawah Ijen", "Kawah Wurung", "Pucak P28",
        "Air Terjun Tancak Kembar", "Air Terjun Blawan","Air Terjun Polo Angung",
        "Bosamba Rafting", "Situs Megalitikum", "Kebun Kopi Arabika Jampit",
        "Bendungan Sampean Baru", "Museum Kereta Api Bondowoso", "Batu So’on(The Stonehenge van Java)",
        "Taman Galuh", "Hutan Pohon Pelangi"
    )

    private val destinationLocation = arrayOf(
        "Desa Kalianyar, Kecamatan Ijen, Kabupaten Bondowoso, Jawa Timur",
        "Desa Kalianyar, Kecamatan Sempol, Kabupaten Bondowoso, Jawa Timur",
        "Desa Wonosari, Kec. Grujugan, Kab. Bondowoso",
        "Desa Andongsari, Kec. Pakem, Kab. Bondowoso",
        "Desa Kalianyar, Kec. Sempol, Kabupaten Bondowoso",
        "Desa Sukorejo Kecamatan Sumber Wringin, ± 40 km sebelah timur Kota Bondowoso",
        "Desa Taman Krocok, Koanyar, Taman, Kec. Bondowoso, Kabupaten Bondowoso",
        "Desa Gliseran, Kec. Wringin, Kab. Bondowoso",
        "PTP Nusantara VII Kalista Jampit. 74 Km kearah timur Kabupaten Bondowoso",
        "Dusun Tapen, Desa Pandak, Kec. Klabang, Kab. Bondowoso",
        "Kademangan, Kec. Bondowoso, Kabupaten Bondowoso",
        "Tenggina, Solor, Cermee, Kab. Bondowoso",
        "Sumber Rejo, Sempol/Kecamatan Ijen, Kabupaten Bondowoso, Jawa Timur",
        "Desa Sumberwringin, Kecamatan Sumberwringin Kabupaten Bondowoso, Jawa Timur"
    )

    private val destinationHTM = arrayOf(
        "Rp.5.000 - 150.000 per orang",
        "Rp.5.000 per orang",
        "Rp.7.000 per orang",
        "Rp.5.000 per orang",
        "Rp.8.000 per orang",
        "Rp.10.000 per orang",
        "Rp.25.000 per orang",
        "Rp.9.000 per orang",
        "Rp.15.000 per orang",
        "Rp.5.000 per orang",
        "-",
        "-",
        "Rp.7.000 per orang",
        "Rp.5.000 per orang"
    )

    private val destinationOnMaps = arrayOf(
        "https://www.google.com/maps/place/Kawah+Ijen/@-8.0580596,114.2374049,16z/data=!3m1!4b1!4m5!3m4!1s0x2dd1360879927549:0xa9c052cab461fff1!8m2!3d-8.0584134!4d114.2412788?hl=id",
        "https://www.google.com/maps/place/Kawah+Wurung/@-8.0648425,114.1591354,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd13534fdbc47a5:0x5c5b0e5a9e8d9955!8m2!3d-8.0648478!4d114.1613241?hl=id",
        "https://www.google.com/maps/place/PUNCAK+PESONA+P28+PATIRANA/@-7.9760729,113.7390267,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6e8351591b3df:0x6494c4abdb3243c3!8m2!3d-7.9760782!4d113.7412154?hl=id",
        "https://www.google.com/maps/place/Air+Terjun+Tancak+Kembar/@-7.9339657,113.6938683,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6e623dfa316cf:0x87433cc720dc2c85!8m2!3d-7.933971!4d113.696057?hl=id",
        "https://www.google.com/maps/place/Air+Terjun+Blawan/@-7.9854398,114.173853,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd135a38c58ed05:0xadc0d3659ea0560b!8m2!3d-7.9854451!4d114.1760417?hl=id",
        "https://www.google.com/maps/place/Air+Terjun+Polo+Agung/@-7.9553708,114.0244754,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6ce60c99f325f:0x90c7d227098e967b!8m2!3d-7.9553761!4d114.0266641?hl=id",
        "https://www.google.com/maps/place/Bosamba+Rafting/@-7.9169256,113.8176271,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6dcdc8078e28d:0xaad469f528eaea8c!8m2!3d-7.9169309!4d113.8198158?hl=id",
        "https://www.google.com/maps/place/Megalitikum+Maskuning+Ijen+Geopark/@-7.9781351,113.8861763,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6c5cf1d5c8fab:0xa36424ad731e8ef5!8m2!3d-7.9781404!4d113.888365?hl=id",
        "https://www.google.com/maps/place/Perkebunan+Nusantara+XII.+PT/@-8.2592605,113.6377567,10z/data=!4m9!1m2!2m1!1skebun+kopi+arabika+kalisat+jampit!3m5!1s0x2dd6caa821bc1ef1:0x7f74ebd0b6ac9f73!8m2!3d-8.074375!4d114.133648!15sCiFrZWJ1biBrb3BpIGFyYWJpa2Ega2FsaXNhdCBqYW1waXSSAQthZ3JpY3VsdHVyZQ?hl=id",
        "https://www.google.com/maps/place/Bendungan+Sampean+Baru/@-7.8253566,113.9355742,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6d9e97746df3b:0xc4e0566cf8286232!8m2!3d-7.8253619!4d113.9377629?hl=id",
        "https://www.google.com/maps/place/Museum+Kereta+Api+Bondowoso/@-7.9169389,113.8272901,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6dcc6b1d50baf:0xdc3f480ac1376daa!8m2!3d-7.9169442!4d113.8294788?hl=id",
        "https://www.google.com/maps/place/Batu+So'on+Solor/@-7.8583989,114.0749495,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6d3be60b8aa57:0xf98c1f84e9be7215!8m2!3d-7.8584042!4d114.0771382?hl=id",
        "https://www.google.com/maps/place/Taman+Galuh/@-8.0125082,114.2219493,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd13589bab8bbef:0xbe53919078cad2b5!8m2!3d-8.0125135!4d114.224138?hl=id",
        "https://www.google.com/maps/place/Rainbow+Eucalyptus+%2F+Pohon+Pelangi/@-7.9965671,113.9997417,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6c9b30a21d24d:0xaa910b589866666a!8m2!3d-7.9965724!4d114.0019304?hl=id"
    )

    private val destinationDescription = arrayOf(
        "Kawah Ijen adalah sebuah wisata alam berupa danau asam yang warnanya hijau kebiruan dengan diameter sekitar 700 meter dan luas mencapai 5.466 hektar. Kawah Ijen memiliki kedalaman hingga 200 meter dan volume danau bisa mencapai 36 juta meter kubik. Danau ini terbentuk secara alami akibat letusan Gunung Ijen yang masih aktif hingga akhirnya membentuk lekukan besar dan menjadi sebuah danau.",
        "Objek wisata Kawah Wurung dapat dikunjungi dengan menggunakan kendaraan bermotor. Dari pintu masuk Kawah Ijen, objek wisata ini dapat ditempuh dalam kurun waktu kurang dari 20 menit perjalanan menggunakan kendaraan bermotor. Jika Anda tertarik untuk berkunjung ke objek wisata ini, Anda dapat mengunjunginya kapan saja dengan biaya tiket masuk sebesar Rp.3000. Kawah wurung adalah bukit dengan cerukan seperti kawah gunung yang diselimuti padang rumput bak permadani hijau. Kawah ini juga dikenal dengan nama Bukit Cincin",
        "Puncak P28 Bondowoso terletak di Dusun Patirana, Desa Wonosari, Kec. Grujugan, Kab. Bondowoso. Objek wisata ini memiliki ketinggian sekitar 1674 meter di atas permukaan laut dan telah dilengkapi dengan berbagai macam ornamen romantis untuk berfoto. Saat berada di Puncak P28 Bondowoso, Anda dapat melakukan berbagai macam aktivitas wisata menarik. Dari mulai bersantai sembari menikmati sejuknya udara khas dataran tinggi Bondowoso, sampai dengan melakukan take foto di berbagai ornamen yang tersedia, semuanya bisa Anda lakukan di sini. Puncak P28 Bondowoso dibuka untuk umum setiap hari dari mulai pagi hingga petang. Karena objek wisata ini terletak di daerah perbukitan dan memiliki cuaca yang relatif “bersahabat”, objek wisata ini nyaman untuk dikunjungi kapan saja.",
        "Nah, ketika berkunjung ke Bondowoso, Anda kudu harus menyempatkan diri Anda untuk singgah ke beberapa objek wisata air terjun yang ada di sini, seperti salah satunya adalah Air Terjun Tancak Kembar. Tempat wisata Keluarga di Bondowoso ini diberi nama Air Terjun Tancak Kembar karena aliran airnya yang terbagi dua dengan ukuran yang nyaris sama. Bila dibandingkan dengan beberapa objek wisata air terjun lain yang ada di Bondowoso, Air Terjun Tancak Kembar tergolong memiliki aliran yang cukup tinggi, yaitu 77 meter dan 50 meter. Aliran airnya sendiri tergolong cukup deras dengan kondisi air yang relatif cukup jernih. Jika Anda tertarik untuk berwisata ke air terjun ini, lokasinya ada di Desa Andongsari, Kec. Pakem, Kab. Bondowoso.",
        "Akses lokasi menuju objek wisata air terjun ini sudah tergolong cukup bagus. Fasilitas yang tersedia pun juga relatif cukup lengkap, sehingga tidak heran jika air terjun ini berhasil menjadi salah satu objek wisata keluarga di Bondowoso yang sangat populer di kalangan wisatawan lokal. Walaupun di hari libur dan akhir pekan air terjun ini selalu ramai dikunjungi oleh wisatawan, namun kondisi air terjun ini masih terjaga dengan sangat baik. Kondisi airnya masih tergolong sangat jernih dan terbebas dari polusi. Untuk bentuk air terjunnya sendiri tergolong tidak terlalu tinggi, namun alirannya melebar ke arah samping, sehingga menghasilkan panorama unik tersendiri yang luar biasa eksotis.",
        "Di Desa Sekorejo, Kec. Wrinin, ada sebuah objek wisata air terjun yang menawarkan pemandangan tebing bebatuan dan aliran air yang jernih. Nama air terjun tersebut adalah Air Terjun Polo Agung. Aliran air terjun Polo Agung tidak terlalu deras. Ketinggiannya pun hanya beberapa belas meter saja. Walaupun begitu, kondisi airnya benar – benar sangat jernih. Selain itu, karena posisi air terjun ini tepat berada di lintasan matahari, di waktu – waktu tertentu, saat tersorot matahari, aliran airnya akan terlihat bercahaya dan berwarna – warni layaknya pelangi.",
        "Tempat wisata di Bondowoso yang satu ini sangat cocok untuk Anda para pecinta aktivitas wisata yang memacu adrenalin. Di objek wisata ini, Anda akan diajak untuk merasakan sensasi bermain rafting di sepanjang aliran Sungai Sampean Baru. Di Bondowoso, Sungai Sampean Baru dikenal sebagai lokasi rafting yang sangat menantang. Karakter sungainya cenderung berbatu dengan kondisi tebing yang cukup terjal. Biasanya, dalam kondisi normal, aktivitas rafting di sungai ini membutuhkan waktu tempuh selama kurang lebih dua jam.",
        "Khusus untuk Anda para pecinta objek wisata sejarah, saat berlibur ke Bondowoso, Anda kudu harus menyempatkan diri untuk singgah ke objek wisata yang satu ini. Di tempat ini, Anda dapat melihat secara langsung beranekaragam dolmen dan sarkofagus peninggalan era batu besar. Untuk memudahkan para wisatawan, pengelola objek wisata ini telah mengelola lokasi objek wisata ini sedemikian rupa sehingga “ramah” terhadap wisatawan. Lokasi objek wisata Situs Megalitikum Bondowoso ada di Desa Gliseran, Kec. Wringin, Kab. Bondowoso. Di hari normal, objek wisata ini buka setiap hari dari mulai pagi hingga petang.",
        "Bukan cuma Gayo saja yang punya perkebunan kopi. Kabupaten Bondowoso pun juga memilikinya, namanya Perkebunan Kopi Arabika Kalisat Jampit. Perkebunan Kopi Arabika Kalisat Jampit merupaka perkebunan kopi milik PTPN VIII Kalisat Jampit. Perkebunan yang memiliki luas sekitar 4.000 hektar ini terletak di ketinggian 900 mdpl. Di perkebunan ini, Anda dapat melihat secara langsung bagaimana kopi ditanam, dipetik, dan diolah hingga menjadi bubuk kopi yang siap untuk dikonsumsi. Jika mau, Anda juga bisa menikmati kopi Arabika langsung di beberapa warung yang ada di kompleks perkebunan ini.",
        "Walaupun hanya berupa bendungan, namun objek wisata ini memiliki tampilan yang cukup unik. Area belakang / bawah bendungan ini telah dilengkapi dengan ratusan batu yang mirip dengan tumpukan nisan. Berkat keberadaan tumpukan batu yang mirip nisan tersebut, objek wisata yang berlokasi di Dusun Tapen, Desa Pandak, Kec. Klabang, Kab. Bondowoso ini benar – benar sangat pas untuk dijadikan sebagai tempat untuk hunting foto. Karena berstatus fasilitas umum, objek wisata ini dapat dikunjungi kapan saja tanpa harus membayar biaya tiket masuk sama sekali. Waktu terbaik untuk berkunjung ke objek wisata ini sendiri adalah di pagi hari atau sore hari, yaitu ketika sinar matahari tidak terlalu terik.",
        "“Lho, bukannya pusat industri kereta api Indonesia terletak di Madiun ya? Kok museumnya ada di Bondowoso sih?” Ya, pusat industri kereta api Indonesia saat ini memang berlokasi di Madiun. Namun itu hanya saat ini. Dulu, saat masa kolonial Belanda, pusat industri kereta api adanya di Bondowoso. Itulah kenapa Bondowoso memiliki museum kereta api. Di museum ini, Anda dapat mempelajari sejarah perkembangan kereta api di Pulau Jawa sejak era kolonial Belanda. Di hari normal, objek wisata yang berlokasi di Kademangan, Kec. Bondowoso ini beroperasi dari mulai pagi hingga sore. Jika Anda merupakan seorang pecinta sejarah, objek wisata yang satu ini wajib Anda masukkan ke dalam daftar kunjungan wisata Anda selama berlibur di Bondowoso.",
        "Anda pasti pernah mendengar objek wisata Stone Henge di Inggris bukan? Nah, Bondowoso juga memiliki objek wisata yang mirip dengan objek wisata tersebut lho! Nama objek wisatanya adalah objek wisata Batu So’on. Di objek wisata ini Anda dapat melihat mukjizat alam berupa bebatuan besar yang terkesan seperti disusun. Jika Anda tertarik untuk mengunjunginya, lokasi objek wisata Batu So’on ada di  Tenggina, Solor, Cermee, Kab. Bondowoso. Di hari normal, objek wisata ini buka setiap hari dari mulai pagi hingga sore.",
        "Tempat wisata di Bodowoso selanjutnya adalah taman Galuh yang fenomenal. Taman ini memiliki pemandangan yang sangat cantik dan memikat.  Siapa saja yang datang kesini pasti akan terkagum-kagum dengan keindahan panoraman yang tiada duanya.Taman Galuh ini belakangan viral karena banyak beredar di media sosial anak-anak muda yang selfie-selfie cantik disini.",
        "Tempat wisata di Bondowoso selanjutnya adalah pohon pelangi di Hutan Bogor. Meskipun namanya hutan Bogor, tapi bukan di daerah Bogor ya. Pohon pelangi ini yang memiliki bentuk sangat unik ini memiliki nama ilmiah Eucalyptus deglupta ini sejatinya memang memiliki batang aneka warna seperti pelangi. Warna unik dari pohon ini bersumber dari getah yang keluar dari pohon dan mengenai kulit pohon dan membentuk sebuah lapisan warna. Warna yang muncul dari getah ini adalah biru, kemudian berubah menjadi jingga, ungu, dan merah marun. Wah pasti ketjeh nih kalau dijadikan foto profil instagram."
    )

    private val destinationImage = intArrayOf(
        R.drawable.ijen, R.drawable.kawah_wurung, R.drawable.dua_delapan,
        R.drawable.tancak_kembar, R.drawable.blawan, R.drawable.polo,
        R.drawable.bosamba, R.drawable.megalitikum, R.drawable.kopi_kalisat,
        R.drawable.samba, R.drawable.museum_kai, R.drawable.soon,
        R.drawable.galuh, R.drawable.pohon_pelangi
    )

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (i in destinationName.indices){
                val destination = Destination()
                destination.name = destinationName[i]
                destination.photo = destinationImage[i]
                destination.location = destinationLocation[i]
                destination.htm = destinationHTM[i]
                destination.description = destinationDescription[i]
                destination.onMaps = destinationOnMaps[i]
                list.add(destination)
            }
            return list
        }
}