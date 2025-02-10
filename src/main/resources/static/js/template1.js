document.addEventListener('DOMContentLoaded', function() {
    // Menyembunyikan filter2 dan filter3 pada saat halaman pertama kali dimuat
    document.querySelector('.filter2').style.display = 'none';
    document.querySelector('.filter3').style.display = 'none';

    // Menambahkan event listener untuk tombol "Add Filter"
    document.querySelectorAll('.add-button').forEach((button, index) => {
        button.addEventListener('click', function(event) {
            event.preventDefault();  // Mencegah form submit jika tombol Add Filter ada di dalam form

            if (index === 0) {
                // Menampilkan filter2 ketika Add Filter di filter1 diklik
                document.querySelector('.filter2').style.display = 'flex';
            } else if (index === 1) {
                // Menampilkan filter3 ketika Add Filter di filter2 diklik
                document.querySelector('.filter3').style.display = 'flex';
            }
        });
    });

    // Menambahkan event listener untuk tombol "Delete Filter"
    document.querySelectorAll('.delete-button').forEach((button, index) => {
        button.addEventListener('click', function(event) {
            event.preventDefault();  // Mencegah form submit jika tombol Delete Filter ada di dalam form

            if (index === 0) {
                // Menyembunyikan filter1 dan mengosongkan nilainya ketika Delete Filter di filter1 diklik
                document.querySelector('.filter1').style.display = 'none';
                document.querySelector('#filter1').value = ''; // Kosongkan nilai filter1
                toggleInputAndRadio('#filter1', '#search1', '#status-container1');
            } else if (index === 1) {
                // Menyembunyikan filter2 dan mengosongkan nilainya ketika Delete Filter di filter2 diklik
                document.querySelector('.filter2').style.display = 'none';
                document.querySelector('#filter2').value = ''; // Kosongkan nilai filter2
                toggleInputAndRadio('#filter2', '#search2', '#status-container2');
            } else if (index === 2) {
                // Menyembunyikan filter3 dan mengosongkan nilainya ketika Delete Filter di filter3 diklik
                document.querySelector('.filter3').style.display = 'none';
                document.querySelector('#filter3').value = ''; // Kosongkan nilai filter3
                toggleInputAndRadio('#filter3', '#search3', '#status-container3');
            }
        });
    });

    // Fungsi untuk menampilkan atau menyembunyikan input dan radio button
    function toggleInputAndRadio(filterElementId, inputId, statusContainerId) {
        const filterElement = document.querySelector(filterElementId);
        const inputElement = document.querySelector(inputId);
        const statusContainer = document.querySelector(statusContainerId);

        if (filterElement && inputElement && statusContainer) {
            if (filterElement.value === 'status') {
                // Sembunyikan input dan tampilkan radio button
                inputElement.style.display = 'none';
                statusContainer.style.display = 'block';
            } else {
                // Tampilkan input dan sembunyikan radio button
                inputElement.style.display = 'block';
                statusContainer.style.display = 'none';
            }
        }
    }

    // Menambahkan event listener untuk filter yang mengubah input dan radio button
    function setFilterBehavior(filterElementId, inputId, statusContainerId) {
        const filterElement = document.querySelector(filterElementId);

        filterElement.addEventListener('change', function() {
            toggleInputAndRadio(filterElementId, inputId, statusContainerId);
        });
    }

    // Set filter behavior untuk filter 1, filter 2, dan filter 3
    setFilterBehavior('#filter1', '#search1', '#status-container1');
    setFilterBehavior('#filter2', '#search2', '#status-container2');
    setFilterBehavior('#filter3', '#search3', '#status-container3');
});
