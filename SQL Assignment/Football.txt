-- Creating a database Football.

 create database Football;

-- Creating a table Football_Venue 

create table Football_Venue
(
	venue_id number(4),
	venue_name varchar2(20),
	city_id number(4),
	capacity number(6)
);

-- Inserting Data into Football_Venue table

insert into Football_Venue values(365,'Japan',3024,700000);
insert into Football_Venue values(785,'France',9687,300000);
insert into Football_Venue values(168,'Australia',4687,400000);
insert into Football_Venue values(956,'Portugal',3598,510000);
insert into Football_Venue values(436,'Spain',7624,690000);
insert into Football_Venue values(783,'Argentina',1024,703000);
insert into Football_Venue values(168,'Australia',9635,800000);
insert into Football_Venue values(534,'Corotia',2457,980000);
insert into Football_Venue values(783,'Argentina',3568,440000);
insert into Football_Venue values(436,'Spain',4625,830000);

-- Counting the number of venues of the football world cup

select COUNT(venue_id) from Football_Venue;

-- List of all the venue names and capacities in the format of Location and Volume	

select venue_name as Location, capacity as Volume from Football_Venue;

-- Deleting all the details where venue_name is equal to Australia.

delete from Football_venue where venue_name='Australia';