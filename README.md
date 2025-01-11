# RecruitWise. 
HR-монитор: управление эффективностью
## Функциональность
Панель управления для рекрутеров, которая включает в себя следующие функции:
- отображение основных метрик (количество обработанных резюме, количество проведенных интервью, среднее время закрытия вакансии и т.д.)
- возможность фильтрации и сортировки данных по различным параметрам (дата, тип вакансии, рекрутер и т.д.)
- визуализация данных с помощью графиков и диаграмм + собственные способы визуализации, интерактивные элементы для детального анализа (древовидные структуры, сводные таблицы и т.д.)
- интеграция с существующими HR-системами для автоматического получения данных.
## Требования
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Hibernate
- Docker
## Запуск
Необходимо перейти в директорию с проектом. Затем в docker:
'cd docker'
Осталось запустить docker-compose:
'docker compose up -d'
__Примечания:__
- Флаг '-d' нужен для автономного запуска контейнера без отображения логов.
- В новых версиях Ubuntu вызов docker-compose работает через 'docker compose' вместе привычного 'docker-compose'
