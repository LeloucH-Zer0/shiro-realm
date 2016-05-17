CREATE TABLE `qcaas`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `token` VARCHAR(100) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `user_id` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `first_name_UNIQUE` (`first_name` ASC));
  
  CREATE TABLE `qcaas`.`user_roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `roles` VARCHAR(200) NOT NULL,
  `permissions` VARCHAR(200) NOT NULL DEFAULT 'read', 
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES user(`user_id`) ON DELETE CASCADE);
  
INSERT INTO `qcaas`.`user` (`id`, `email`, `password`, `token`, `first_name`, `user_id`, `username`) VALUES ('1', 'justine.thomas@snapdeal.com', '123456', 'randomlylongstring', 'Justine', 1, 'Justine');
INSERT INTO `qcaas`.`user` (`id`, `email`, `password`, `token`, `first_name`, `user_id`, `username`) VALUES ('2', 'mayank.lohani@snapdeal.com', '123456', 'randomlydoublelongstring', 'Mayank', 2, 'Mayank');
INSERT INTO `qcaas`.`user` (`id`, `email`, `password`, `token`, `first_name`, `user_id`, `username`) VALUES ('3', 'sourabh.02@snapdeal.com', '123456', 'randomlylongstring', 'Sourabh', 3, 'Sourabh');

  
INSERT INTO `qcaas`.`user_roles` (`id`, `user_id`, `roles`) VALUES ('1', '1', 'tenant_admin');
INSERT INTO `qcaas`.`user_roles` (`id`, `user_id`, `roles`) VALUES ('2', '2', 'org_admin');
INSERT INTO `qcaas`.`user_roles` (`id`, `user_id`, `roles`) VALUES ('3', '3', 'node_admin');

  
  

  
  
