CREATE TABLE `products` (
`id` int(6) unsigned NOT NULL,
`brand` varchar(50) NOT NULL,
`name` varchar(50) NOT NULL,
`info` varchar(50) NOT NULL,
`image` varchar(100) NOT NULL,
`largeimage` varchar(100) NOT NULL,
`price` int(11) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


[{"id":1, "brand":"Apple", "name":"iPhone 6s", "info":"White, 16GB", "image":"img/products/apple-iphone-6s.jpeg", "largeimage":"img/products/apple-iphone-6s-large.jpeg", "price":46499},
 {"id":2, "brand":"Blackberry", "name":"Blackberry Porsche", "info":"Black, 64GB", "image":"img/products/blackberry-porsche.jpeg", "largeimage":"img/products/blackberry-porsche-large.jpeg", "price":59990},
 {"id":3, "brand":"HTC", "name":"HTC One M9", "info":"Space Grey, 16GB", "image":"img/products/htc-one-m9.jpeg", "largeimage":"img/products/htc-one-m9-large.jpeg", "price":31500},
 {"id":4, "brand":"Huawei", "name":"Huawei Nexus 6P", "info":"White, 16GB", "image":"img/products/huawei-nexus-6p.jpeg", "largeimage":"img/products/huawei-nexus-6p-large.jpeg", "price":39999},
 {"id":5, "brand":"LG", "name":"LG G4", "info":"Shiny Gold, 32GB", "image":"img/products/lg-g4.jpeg", "largeimage":"img/products/lg-g4-large.jpeg", "price":35899},
 {"id":6, "brand":"Motorola", "name":"Motorola Moto X Force", "info":"White, 16GB", "image":"img/products/motorola-moto-x-force.jpeg", "largeimage":"img/products/motorola-moto-x-force-large.jpeg", "price":32199},
 {"id":7, "brand":"Samsung", "name":"Samsung Galaxy S6 Edge", "info":"Gold Platinum, 32GB", "image":"img/products/samsung-galaxy-s6-edge.jpeg", "largeimage":"img/products/samsung-galaxy-s6-edge-large.jpeg", "price":40900},
 {"id":8, "brand":"Samsung", "name":"Samsung Note 4", "info":"Charcoal Black, 32GB", "image":"img/products/samsung-note-4.jpeg", "largeimage":"img/products/samsung-note-4-large.jpeg", "price":35840},
 {"id":9, "brand":"Samsung", "name":"Samsung Note 5", "info":"White, 16GB", "image":"img/products/samsung-note-5.jpeg", "largeimage":"img/products/samsung-note-5-large.jpeg", "price":39900},
 {"id":10, "brand":"Sony", "name":"Sony Xperia Z5 Premium", "info":"Black, 32GB", "image":"img/products/sony-xperia-z5-premium.jpeg", "largeimage":"img/products/sony-xperia-z5-premium-large.jpeg", "price":39999}]