CREATE TABLE `users` (
  `id` int PRIMARY KEY,
  `name` varchar(255),
  `linked_nickname` varchar(255)
);

CREATE TABLE `games` (
  `id` int PRIMARY KEY,
  `name` varchar(255),
  `url_api` varchar(255)
);

CREATE TABLE `user_game` (
  `id` int PRIMARY KEY,
  `game_id` int,
  `user_id` int
);

CREATE TABLE `linked_players` (
  `id` int PRIMARY KEY,
  `user_id` int,
  `nickname` varchar(255)
);

CREATE TABLE `tips` (
  `id` int PRIMARY KEY,
  `data` varchar(255),
  `game_id` int
);

CREATE TABLE `general_images` (
  `id` int PRIMARY KEY,
  `image_url` varchar(255),
  `game_id` int
);

ALTER TABLE `user_game` ADD FOREIGN KEY (`game_id`) REFERENCES `games` (`id`);

ALTER TABLE `user_game` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `linked_players` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `tips` ADD FOREIGN KEY (`game_id`) REFERENCES `games` (`id`);

ALTER TABLE `general_images` ADD FOREIGN KEY (`game_id`) REFERENCES `games` (`id`);
